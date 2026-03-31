# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        curr_max=[0]
        def dfs(root):
            if not root:
                return 0
            if not root.left and not root.right:
                return 1
            l=dfs(root.left)
            r=dfs(root.right)
            curr_max[0]=max(curr_max[0],l+r)
            return max(l,r)+1
        dfs(root)
        return curr_max[0]