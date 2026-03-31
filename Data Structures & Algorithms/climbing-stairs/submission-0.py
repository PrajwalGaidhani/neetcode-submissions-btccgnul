class Solution:
    def climbStairs(self, n: int) -> int:
        def climb(n):
            if n==1 or n==0:
                return 1
            if n<0:
                return 0
            x=climb(n-1)
            y=climb(n-2)
            # print(x,y)
            return x+y
        return climb(n)