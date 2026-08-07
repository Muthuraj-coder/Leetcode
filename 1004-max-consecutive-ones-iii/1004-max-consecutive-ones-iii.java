class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length,zerocount=0,max=0;
        for(int i=0;i<n;i++){
            zerocount=0;
            for(int j=i;j<n;j++){
                if(nums[j]==0){
                    zerocount++;
                }
                if(zerocount>k){
                    break;
                }
                max = Math.max(max,j-i+1);
            }
        }
        return max;
    }
}