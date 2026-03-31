class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        ans=[]
        def rec(i,temp):
            if i>len(nums)-1:
                ans.append(temp[:])
                return 
            temp.append(nums[i])
            rec(i+1,temp)
            temp.pop()
            rec(i+1,temp)
        rec(0,[])
        return ans