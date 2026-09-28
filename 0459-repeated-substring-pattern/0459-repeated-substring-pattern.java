class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int len = 1; len < n; len++) {

            String pattern = s.substring(0, len);
            String result = "";

            while (result.length() < n) {
                result += pattern;
            }

            if (result.equals(s)) {
                return true;
            }
        }

        return false;
    }
}