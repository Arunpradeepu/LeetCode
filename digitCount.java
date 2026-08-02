class Solution {
    public boolean digitCount(String num) {
        int[] arr = new int[11];

        for(char ch : num.toCharArray()){
            int val = ch - '0';
            arr[val]++;           
        }

        for(int i=0;i<num.length();i++){
            if(num.charAt(i)-'0' != arr[i]){
                return false;
            }
        }


        return true;
    }
}