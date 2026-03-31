
class Solution { 
    public int helper(int[] dp, int ind, String s) {
        if (ind >= s.length()) return 1;
        if (s.charAt(ind) == '0') return 0;
        if (dp[ind] != -1) return dp[ind];

        int takeSingle = helper(dp, ind + 1, s); // Take one character
        int takeDouble = 0;
        
        if (ind + 1 < s.length()) {
            int num = Integer.parseInt(s.substring(ind, ind + 2));
            if (num >= 10 && num <= 26) {
                takeDouble = helper(dp, ind + 2, s); // Take two characters
            }
        }

        return dp[ind] = takeSingle + takeDouble;
    }

    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return helper(dp, 0, s);
    }
}
