sum=0
i=0
for i in range(i,len(nums)):
    for j in range(i+1,len(nums)):
        sum=nums[i]+nums[j]
        if sum==target:
           return(i,j)