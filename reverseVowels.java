class Solution {
    public String reverseVowels(String s) {
        int l = 0;
        int r = s.length()-1;
        char[] arr = s.toCharArray();

        while(l < r){
            

            if(isVowel(s.charAt(l)) && isVowel(s.charAt(r))){
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
            else if(isVowel(s.charAt(l))){
                r--;
            }
            else{
                l++;
            }
        }

        return new String(arr);
        
    }

    public static boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch)!=-1;
    }

}