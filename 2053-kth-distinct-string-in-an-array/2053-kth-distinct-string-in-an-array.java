class Solution {
    public String kthDistinct(String[] arr, int k) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            int freq=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    freq++;
                }
            }
            if(freq==1){
                count++;
            }
            if(count==k){
                return arr[i];
            }
        }
        return "";
    }
}