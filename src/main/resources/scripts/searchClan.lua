local upper = 50
local lower = 1
local clanLevel = 1
local needCrown = 0

local SKIP = "SKIP"
local sMemberCommand = 'smembers'
local sInterCommand = 'SINTER'
local sisMemberCommand = "SISMEMBER"
local hgetCommand = "HGET"

local keyClanId  = "CLANID"
local keyCountry = "CLANCOUNTRY:"
local keyFightRate = "CLANFIGHTRATE:"
local keyJoinType = "ClANJOINTYPE:"
local keyName2Id = "CLANNAME:CLANID"

local ret = redis.call(sMemberCommand, keyClanId)

local clanCountry 
local clanFightRate
local clanJoinType

if KEYS[7] ~= SKIP then
	local isExist = redis.call(sisMemberCommand, keyName2Id, KEYS[7])
	if isExist then
		local a = redis.call(hgetCommand, keyName2Id, KEYS[7])  
		return {a}
	end
end

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

local isSetMin = false
local isSetMax = false
local isSetLevel = false
local isSetCrown = false

--成员数下限
if KEYS[4] ~= SKIP then
	lower = tonumber(KEYS[4])
	isSetMin = true
end
--成员数上限
if KEYS[5] ~= SKIP then
	upper = tonumber(KEYS[5])
	isSetMax = true
end

--公会等级
if KEYS[6] ~= SKIP then
	clanLevel = tonumber(KEYS[6])
	isSetLevel = true
end

--需要的皇冠数量
if KEYS[8] ~=SKIP then
	needCrown = tonumber(KEYS[8])
	isSetCrown = true
end

if isSetMin or isSetMax or isSetLevel or isSetCrown then 
	local rrr  = {}
	-- 检查成员数
	for k, v in ipairs(ret) do
		if isSetMin or isSetMax then
			local num = redis.call("get" , "CLAN:" .. v .. ":MemberNum")
			num = tonumber(num)	
			if num < lower or num > upper then 
				break
			end
		end
		if isSetLevel then 
			local level = redis.call("get" , "CLAN:" .. v .. ":ClanLevel")
			level = tonumber(level)
			if level < clanLevel then
				break
			end
		end
		
		if isSetCrown then
			local crown = redis.call("get", "CLAN:" .. v .. ":TotalCrown")
			crown = tonumber(crown)
			if crown < needCrown then
				break 
			end
		end
		
		rrr[#rrr+1] = v
		if #rrr >= 50 then 
			return rrr
		end
	end
	return rrr
else 
	if #ret > 50 then 
		ret = redis.call('SRANDMEMBER', ret , 50)
	end	
	return ret
end
