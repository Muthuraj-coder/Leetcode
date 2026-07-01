class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] lp = new int[nums.length];
        int [] rp = new int[nums.length];

        lp[0] = 1;
        for(int i=1;i<nums.length;i++){
            lp[i]=lp[i-1]*nums[i-1];
        }
        rp[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            rp[i]=rp[i+1]*nums[i+1];
        }

        for(int i=0;i<nums.length;i++){
            if(i==0) nums[i]=rp[i];
            else if(i==nums.length-1) nums[i]=lp[i];
            else nums[i]=lp[i]*rp[i];
        }

        return nums;
        
    }
}