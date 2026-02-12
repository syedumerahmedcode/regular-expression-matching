public class Solution {

    public boolean isMatch(String s, String p) {
        /**
         * Solved using dynamic programming
         */
        if (s == null || p == null) {
            return true;
        }

        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        
        //Base case
        dp[0][0] = true;

        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '*' && dp[0][i - 1]) {
                dp[0][i + 1] = true;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                // checking three different possibilities
                // '.' scenario
                if (p.charAt(j) == '.') {
                    // we get diagonal value
                    dp[i + 1][j + 1] = dp[i][j];
                }
                // charcater scenario
                if (p.charAt(j) == s.charAt(i)) {
                    dp[i + 1][j + 1] = dp[i][j];
                }
                // '*' scenario
                if (p.charAt(j) == '*') {
                    //'.''*' scenario
                    if (p.charAt(j - 1) != s.charAt(i) && p.charAt(j - 1) != '.') {
                        dp[i + 1][j + 1] = dp[i + 1][j - 1];
                    } else {
                        // the three scenarios that are possible
                        dp[i + 1][j + 1] = (dp[i + 1][j] || dp[i][j + 1] || dp[i + 1][j - 1]);
                    }
                }
            }
        }
        return dp[s.length()][p.length()];

        
    }

}
