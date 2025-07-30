class Solution {
    public boolean isPalindrome(String s) {
        String combined = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i=0;
        int j=combined.length()-1;

        while(i<j){
            char start = combined.charAt(i);
            char end = combined.charAt(j);
            
            if(start!=end){
                return false;
            }
            i++;
            j--;
        
        }
        return true;
    }
}