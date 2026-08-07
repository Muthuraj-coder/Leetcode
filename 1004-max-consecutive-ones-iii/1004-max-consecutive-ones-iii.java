class Solution {
    public int longestOnes(int[] nums, int k) {
        int zerocount=0,left=0,max=0;
        int n=nums.length;
        for(int right=0;right<n;right++){
            if(nums[right]==0){
                zerocount++;
            }
            if(zerocount>k){
                if(nums[left]==0) zerocount--;
                left++;
            }
        }
        return n-left;
    }
}