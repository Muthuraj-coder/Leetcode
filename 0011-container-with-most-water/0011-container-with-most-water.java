class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1,temp,ans=0;
        while(left<=right){
            if(height[left]<=height[right]){
                temp =  height[left] * (right-left);
                left++;
            }else{
                temp = height[right] * (right-left);
                right--;
            }
            ans=Math.max(ans,temp);
        }
        return ans;
    }
}