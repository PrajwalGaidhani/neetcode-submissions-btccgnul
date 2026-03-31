class Solution {
    
    public int helper(int[] cost,int ind, int[] dp) {
        if(ind>=cost.length){
            return 0;
        }
        if(dp[ind]!=-1){return dp[ind];}
        int oneStep=helper(cost,ind+1,dp);
        int twoStep=helper(cost,ind+2,dp);
        int ans=cost[ind]+Math.min(oneStep,twoStep);
        dp[ind]=ans;
        return ans;
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int ans=Math.min(helper(cost,0,dp),helper(cost,1,dp));
        return ans;   
    }
}
