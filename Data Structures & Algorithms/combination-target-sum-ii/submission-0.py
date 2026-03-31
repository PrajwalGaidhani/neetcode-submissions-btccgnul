class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        ans=[]
        candidates.sort()
        def rec(start,curr_sum,temp):
            if curr_sum>target or start>len(candidates):
                return
            if curr_sum==target:
                ans.append(temp[:])
                return
            for i in range(start,len(candidates)):
                if i>start and candidates[i]==candidates[i-1]:
                    continue
                temp.append(candidates[i])
                rec(i+1,curr_sum+candidates[i],temp)
                temp.pop()
        rec(0,0,[])
        return ans