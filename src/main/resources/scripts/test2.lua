local set = {}
for i = 1, 10  do 
	if i == 5 then 
		break
	end
	set[#set+1] = i
end
return set