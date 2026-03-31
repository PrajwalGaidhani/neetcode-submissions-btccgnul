# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        curr_max=[0]
        def dfs(root,i):
            if not root:
                return 
            dfs(root.left,i+1)
            dfs(root.right,i+1)
            curr_max[0]=max(curr_max[0],i+1)
        dfs(root,0)
        return curr_max[0]