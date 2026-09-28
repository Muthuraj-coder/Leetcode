class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for(int i=1;i<n;i++){

            if(n%i!=0) continue;

            String sub = s.substring(0,i);
            boolean ans=true;
            
            for(int len=0;len<n;len++){
                if(s.charAt(len)!=sub.charAt(len%i)){
                    ans=false;
                    break;
                }
            }
            if(ans){
                return true;
            }
        }
        return false;
    }
}