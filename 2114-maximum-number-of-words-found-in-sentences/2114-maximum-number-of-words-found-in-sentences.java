class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s:sentences){
            int currlen=s.split(" ").length;
            if(max<currlen){
                max=currlen;
            }
        }
        return max;
    }
}