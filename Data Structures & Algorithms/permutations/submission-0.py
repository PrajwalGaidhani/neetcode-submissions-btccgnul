class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        ans=[]
        def backtrack(start):
            if start==len(nums):
                ans.append(nums[:])
                return
            for i in range(start, len(nums)):
                nums[start],nums[i]=nums[i],nums[start]
                backtrack(start+1)
                nums[start],nums[i]=nums[i],nums[start]
        backtrack(0)
        return ans      
# from typing import List

# class Solution:
#     def permute(self, nums: List[int]) -> List[List[int]]:
#         ans = []
        
#         def create(temp, index_set):
#             if len(index_set) == 0:
#                 ans.append(temp[:])  # Add a copy of temp to ans
#                 return
            
#             for i in index_set:
#                 new_temp = temp + [nums[i]]  # Create a new temp list
#                 new_index_set = index_set - {i}  # Create a new index_set without i
#                 create(new_temp, new_index_set)
        
#         index_set = set(range(len(nums)))
#         create([], index_set)
#         return ans
