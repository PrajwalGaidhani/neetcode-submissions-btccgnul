class Solution {
    public int findTargetSumWays(int[] nums, int target) {

    return helper(nums,  target,  0);
        
    }

    public int helper(int[] nums, int target, int i){
        if(i==nums.length){
            if(0==target){
                return 1;
            }else{
                return 0;
            }
        }
        return helper(nums,target-nums[i] ,i+1)+helper(nums,target+nums[i] ,i+1);
    }  
}
