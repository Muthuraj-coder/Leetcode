class Solution {
    public int lengthOfLastWord(String s) {
        int left=s.length()-1;
        while(left>=0 && s.charAt(left)== ' '){
            left--;
        }
        int x=left;
        while(x>=0 && s.charAt(x)!= ' '){
            x--;
        }
        return left-x;
    }
}