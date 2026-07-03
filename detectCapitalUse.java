class Solution {
    public boolean detectCapitalUse(String word) {
        int cnt = 0;

        for(int i=0;i<word.length();i++){
            int ch = word.charAt(i);
            if(ch <= 90 && ch >= 65){
                cnt++;
            }
        }

        if(cnt == word.length() || cnt == 0){
            return true;
        }
        return cnt == 1 && word.charAt(0) >= 65 && word.charAt(0) <= 90;
    }
}