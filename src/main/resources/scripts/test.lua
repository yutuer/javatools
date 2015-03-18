local upper = 50
local lower = 1
local clanLevel = 1

local SKIP = "SKIP"
local sMemberCommand = 'smembers '
local sInterCommand = 'SINTER'

local keyClanId  = "CLANID"
local keyCountry = "CLANCOUNTRY:"
local keyFightRate = "CLANFIGHTRATE:"
local keyJoinType = "ClANJOINTYPE:"

local ret = redis.call(sMemberCommand, keyClanId)
if #ret <= 50 then
	return ret
end

local clanCountry 
local clanFightRate
local clanJoinType

-- 国家
if KEYS[1] ~= SKIP then 
	clanCountry = redis.call(sMemberCommand , keyCountry .. KEYS[1])	
	ret = clanCountry
end

--战争频率
if KEYS[2] ~= SKIP then
	clanFightRate = redis.call(sMemberCommand , keyFightRate .. KEYS[2])
	ret = redis.call(sInterCommand , ret , clanFightRate)
end

--加入条件
if KEYS[3] ~= SKIP then
	clanJoinType = redis.call(sMemberCommand , keyJoinType .. KEYS[3])
	ret = redis.call(sInterCommand, ret , clanJoinType)
end

local isSet = false
--成员数下限
if KEYS[4] ~= SKIP then
	lower = KEYS[4]
	isSet = true
end
--成员数上限
if KEYS[5] ~= SKIP then
	upper = KEYS[5]
	isSet = true
end

--公会等级
if KEYS[6] ~= SKIP then
	clanLevel = KEYS[6]
	isSet = true
end

local rrr  = {}

if isSet then 
	-- 检查成员数
	for k, v in ipairs(ret) do
		local num = redis.call("get " .. "CLAN:" .. v .. ":MemberNum")
		local level = redis.call("get " .. "CLAN:" .. v .. ":ClanLevel")
		if num >= lower and num <= upper and level >= clanLevel then
			rrr[#rrr+1] = v
			if #rrr >= 50 then 
				return rrr
			end
		end	 
	end
end

if #ret > 50 then 
	ret = redis.call('SRANDMEMBER', ret , 50)
end

return ret
