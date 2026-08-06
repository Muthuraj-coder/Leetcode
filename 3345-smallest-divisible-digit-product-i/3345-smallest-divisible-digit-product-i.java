class Solution {
    public int smallestNumber(int n, int t) {
        int min=Integer.MAX_VALUE;
        for(int i=n;i<=100;i++){
            int prod=1;
            int temp=i,num=i;
            while(temp>0){
                prod=prod*(temp%10);
                temp=temp/10;
            }
            if(prod%t==0){
                min=Math.min(min,num);
            }
        }
        return min;
    }
}