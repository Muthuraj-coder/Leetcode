class Solution {
    public int maximumWealth(int[][] accounts) {
        int res=0;
        for(int i=0;i<accounts.length;i++){
            int max=0;
            for(int j=0;j<accounts[i].length;j++){
                max+=accounts[i][j];
            }
            if(res<max)
                res=max;
        }
        return res;
    }
}