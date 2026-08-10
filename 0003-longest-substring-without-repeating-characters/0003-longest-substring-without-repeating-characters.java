class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        int max=0,left=0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            if(mp.containsKey(ch)){
                left=Math.max(left,mp.get(ch)+1);
            }
             mp.put(ch,right);
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}