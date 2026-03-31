// class Solution { 
//     public int helper(int[] dp, int ind, String s) {
//         if (ind >= s.length()) return 1;
//         if (s.charAt(ind) == '0') return 0;
//         if (dp[ind] != -1) return dp[ind];

//         int takeSingle = helper(dp, ind + 1, s); // Take one character
//         int takeDouble = 0;
        
//         if (ind + 1 < s.length()) {
//             int num = Integer.parseInt(s.substring(ind, ind + 2));
//             if (num >= 10 && num <= 26) {
//                 takeDouble = helper(dp, ind + 2, s); // Take two characters
//             }
//         }

//         return dp[ind] = takeSingle + takeDouble;
//     }

//     public int numDecodings(String s) {
//         int n = s.length();
//         int[] dp = new int[n];
//         Arrays.fill(dp, -1);
//         return helper(dp, 0, s);
//     }
// }
class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;
        int n = s.length();
        int[] dp = new int[n + 1];

        dp[n] = 1; // Base case: empty string has one valid decoding
        dp[n - 1] = s.charAt(n - 1) != '0' ? 1 : 0;

        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i) == '0') continue; // '0' can't be a valid starting digit
            
            dp[i] = dp[i + 1];

            int num = Integer.parseInt(s.substring(i, i + 2));
            if (num >= 10 && num <= 26) {
                dp[i] += dp[i + 2];
            }
        }
        
        return dp[0];
    }
}
