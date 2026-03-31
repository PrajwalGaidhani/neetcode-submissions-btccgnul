class Solution {
    public int maxSubArray(int[] nums) {
        int locSum = nums[0];
        int gloSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either start a new subarray at nums[i] or extend the previous one
            locSum = Math.max(nums[i], locSum + nums[i]);
            // Update global max
            gloSum = Math.max(gloSum, locSum);
        }
        return gloSum;
    }
}
