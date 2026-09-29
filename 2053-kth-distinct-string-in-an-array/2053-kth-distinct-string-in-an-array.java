class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String str : arr) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for(Map.Entry<String,Integer> mp : map.entrySet()){
            if(mp.getValue()==1){
                k--;
                if(k==0){
                    return mp.getKey();
                }
            }
        }

        return "";
    }
}