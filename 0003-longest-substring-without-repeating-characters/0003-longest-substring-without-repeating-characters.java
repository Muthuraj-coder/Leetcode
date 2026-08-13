class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();
        int max=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (list.contains(ch)) {
                int index = list.indexOf(ch);
                for (int j = 0; j <= index; j++) {
                    list.remove(0);
                }
            }
            list.add(ch);
            max=Math.max(max,list.size());
        }
        return max;
    }
}