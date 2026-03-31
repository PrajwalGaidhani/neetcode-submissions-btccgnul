class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2==1){
            return false;
        }
        int h=sum/2;
        int n=nums.length;
        int[][] dp=new int[n+1][h+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=h;j++){
                if(nums[i-1]<=j){
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-nums[i-1]]+nums[i-1]);
                }
            }
        }  
        return dp[n][h]==h;
    }
}



// class Solution {
//     public boolean canPartition(int[] nums) {
//         int sum=0;
//         for(int i:nums){
//             sum+=i;
//         }
//         if(sum%2==1){
//             return false;
//         }
//         int h=sum/2;
//         return h(0,h,nums,0);
//     }
//     boolean h(int i,int h, int[] nums, int s){
//         if(s==h){return true;}
//         if(i>=nums.length){ return false;}
//         return h(i+1,h,nums,s+nums[i]) || h(i+1,h,nums,s);
//     }
// }
