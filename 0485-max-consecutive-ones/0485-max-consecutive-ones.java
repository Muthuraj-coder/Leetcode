class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n=arr.length,max=0,j=0;
        for(int i=0;i<n;i++){
            for(j=i;j<n;j++){
                if(arr[j]==0) break;
            }
            max=Math.max(max,j-i);
        }
        return max;
    }
}