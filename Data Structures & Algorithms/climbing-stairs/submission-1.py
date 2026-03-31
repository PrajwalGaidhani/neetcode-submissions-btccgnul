class Solution:
    def climbStairs(self, n: int) -> int:
        meno={}
        def climb(n):
            if n<=1:
                return 1
            if n not in meno:
                meno[n]=climb(n-1)+climb(n-2)
            return meno[n]
        return climb(n)
        