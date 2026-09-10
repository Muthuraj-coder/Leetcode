class Solution {
    public int maxArea(int[] height) {
        int hight=0,width=0,left=0,right=height.length-1,ans=0;
        while(left<right){
            hight=Math.min(height[left],height[right]);
            width=right-left;
            ans=Math.max(ans,hight*width);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}