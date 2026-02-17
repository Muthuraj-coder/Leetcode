class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        List<Character> ls=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ls.contains(ch)){
                int index = ls.indexOf(ch);
                for (int j = 0; j <= index; j++) {
                    ls.remove(0);
                }
            }
            ls.add(ch);
            max = Math.max(max, ls.size());
        }  
        return max;
    }
}