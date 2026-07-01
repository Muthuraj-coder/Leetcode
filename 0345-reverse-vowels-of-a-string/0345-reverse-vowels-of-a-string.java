class Solution {
    public String reverseVowels(String s) {
        List<Character> ls=new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                ls.add(ch);
            }
        }
        int len=ls.size()-1;
        StringBuilder sb = new StringBuilder(s);
        char [] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' ||arr[i]=='o' ||arr[i]=='u' ||arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){
                arr[i]=ls.get(len);
                len--;
            }
        }
        return new String(arr);
        
    }
}