class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        mul=1
        for i in nums:
            mul*=i
        ans=[]
        for i in range(len(nums)):
            if nums[i]==0:
                m=1
                for j in range(i):
                    m*=nums[j]
                for k in range(i+1,len(nums)):
                    m*=nums[k]
                ans.append(m)
            else:
                ans.append(mul//nums[i])
        return ans

        
        