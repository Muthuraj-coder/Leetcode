class Solution {
    public int smallestIndex(int[] nums) {
        int index=0;
        for(int i:nums){
            int sum=0;
            while(i>0){
                sum+=i%10;
                i=i/10;
            }
            System.out.println(sum);
            if(sum==index){
                return index;
            }
            index++;
        }
        return -1;
    }
}