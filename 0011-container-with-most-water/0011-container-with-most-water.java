class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1,max=-1;
        while(left<=right){
            int width = right-left;
            int heigh = Math.min(height[left],height[right]);
            int area = width* heigh;
            max=Math.max(max,area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}