

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0]; // Special case: only one house

        return Math.max(rob1(nums, 0, n - 2), rob1(nums, 1, n - 1));
    }

    private int rob1(int[] nums, int start, int end) {
        int len = end - start + 1;
        if (len == 1) return nums[start]; // Only one house in range

        int[] dp = new int[len];
        Arrays.fill(dp, -1);
        return helper(nums, start, end, end, dp);
    }

    private int helper(int[] nums, int start, int end, int ind, int[] dp) {
        int relativeIndex = ind - start;
        if (relativeIndex == 0) return nums[start];
        if (relativeIndex == 1) return Math.max(nums[start], nums[start + 1]);
        if (dp[relativeIndex] != -1) return dp[relativeIndex];

        int pick = nums[ind] + helper(nums, start, end, ind - 2, dp);
        int notPick = helper(nums, start, end, ind - 1, dp);

        dp[relativeIndex] = Math.max(pick, notPick);
        return dp[relativeIndex];
    }
}
