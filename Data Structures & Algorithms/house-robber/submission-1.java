class Solution {
    public int helper(int[] nums,int[] dp,int l) {
        if(l==0){return nums[0];}
        if(l==1){return Math.max(nums[0],nums[1]);}
        if(dp[l]!=-1){
            return dp[l];
        }
        int temp1=nums[l]+helper(nums,dp,l-2); 
        int temp2=helper(nums,dp,l-1);
        dp[l]=Math.max(temp1,temp2);
        return dp[l];
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,dp,nums.length-1);
    }
}
