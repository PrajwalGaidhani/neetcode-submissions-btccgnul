class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        ans=[]
        def combine(i,curr_sum,temp):
            if curr_sum==target:
                ans.append(temp.copy())
                return 
            if i>=len(nums) or curr_sum>target:
                return 
            temp.append(nums[i])
            combine(i,curr_sum+nums[i],temp)
            temp.pop()
            combine(i+1,curr_sum,temp)
        combine(0,0,[])
        return ans
                