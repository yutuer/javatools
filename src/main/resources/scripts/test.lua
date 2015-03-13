local upper = 50
local lower = 1
local clanLevel = 1

local SKIP = "SKIP"
local commond = 'smembers'

local ret = redis.call(commond, "Clan")
if #ret == 0 then
	return {}
end

local clanCountry 
local clanFightRate
local clanJoinType

-- 国家
if KEYS[1] ~= SKIP then 
	clanCountry = redis.call(commond, KEYS[1])
	if #clanCountry == 0 then
		return {} 
	end	
	ret = redis.call('SINTER', ret , clanCountry)
end

--战争频率
if KEYS[2] ~= SKIP then
	clanFightRate = redis.call(commond, KEYS[2])
	if #clanFightRate == 0 then
		return {}
	end
	ret = redis.call('SINTER', ret , clanFightRate)
end

--加入条件
if KEYS[3] ~= SKIP then
	clanJoinType = redis.call(commond, KEYS[3])
	if #clanJoinType == 0 then
		return {}
	end
	ret = redis.call('SINTER', ret , clanFightRate)
end

--成员数
if KEYS[4] ~= SKIP then
	lower = KEYS[4]
end

if KEYS[5] ~= SKIP then
	upper = KEYS[5]
end

if KEYS[6] ~= SKIP then
	clanLevel = KEYS[6]
end

for k, v in ipairs(ret) do
	if v.then
	end	 
end

if #ret > 50 then 
	ret = redis.call('SRANDMEMBER', ret , 50)
end

return ret
