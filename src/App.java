public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
        
        '.' Matches any single character.​​​​
        '*' Matches zero or more of the preceding element.
        The matching should cover the entire input string (not partial).
        
        
        
        Example 1:
        
        Input: s = "aa", p = "a"
        Output: false
        Explanation: "a" does not match the entire string "aa".
        Example 2:
        
        Input: s = "aa", p = "a*"
        Output: true
        Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
        Example 3:
        
        Input: s = "ab", p = ".*"
        Output: true
        Explanation: ".*" means "zero or more (*) of any character (.)".
        
         */
        String s = "ab", p = ".*";
        Solution solution = new Solution();
        boolean result = solution.isMatch(s, p);
        System.out.println("The result for the input s: "+s+" and pattern p: "+p+". Is the regular expression matching: "+result);
    }
}
