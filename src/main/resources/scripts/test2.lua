local a = redis.call('get', KEYS[1])
local b = redis.call('smembers' , a)
return b