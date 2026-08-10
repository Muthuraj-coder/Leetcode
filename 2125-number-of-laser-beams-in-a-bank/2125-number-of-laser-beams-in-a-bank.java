class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0, prev = 0;
        for (String s : bank) {
            int count = 0;
            for (char ch : s.toCharArray()) {
                if (ch == '1') {
                    count++;
                }
            }
            if (count != 0) {
                ans = ans + (prev * count);
                prev = count;
            }
        }
        return ans;
    }
}