local a = redis.call('get', KEYS[1])
a = tonumber(a)
return a - 10 