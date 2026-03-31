class Solution {
    public int climbStairs(int n) {
        if(n==0){
            return 1;
        }
        int prev1=1;
        int prev2=1;
        for(int i=0;i<n;i++){
            int temp=prev1;
            prev1=prev2;
            prev2=temp+prev2;
        }
        return prev1;
    }
}
