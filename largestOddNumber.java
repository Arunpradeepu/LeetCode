class Solution {
    public String largestOddNumber(String num) {
        int ans =0;
        for(int i = num.length()-1;i>=0;i--){
            char ch = num.charAt(i);
            int dig = ch - '0';
            if(dig % 2 != 0){
                return num.substring(0, i + 1);
            }
        }


        return "";

    }
}