class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for(int i=1;i<n;i++){
            String sub = s.substring(0,i);
            String res = "";

            while(res.length()<n){
                res+=sub;
            }
            if(res.equals(s)){
                return true;
            }
        }
        return false;
    }
}