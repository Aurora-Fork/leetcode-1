/*
https://leetcode.com/problems/repeated-substring-pattern/
Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of
the substring together. You may assume the given string consists of lowercase English letters only.

Construct all prefixes with lengths that are divide into string. Check if any, when repeated, equal string.
Time - O(n**3)
Space - O(n)
*/

public class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();
        for (int sub = 1; sub <= n / 2; ++sub) {
            if (n % sub != 0)
                continue;
            StringBuilder sb = new StringBuilder();
            String substring = s.substring(0, sub);
            for (int i = 0; i < n / sub; ++i)
                sb.append(substring);
            if (sb.toString().equals(s))
                return true;
        }
        return false;
    }
}

