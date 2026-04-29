void rot(int start,int end,int *nums){
    while(start<end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
    }

}
void rotate(int* nums, int n, int k) {
    k=k%n;
    rot(0,n-1,nums);
    rot(0,k-1,nums);
    rot(k,n-1,nums);
}