class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        int[] fre = new int[26];

        for(int i=0;i<s.length();i++){
            fre[s.charAt(i) - 'a']++;
            fre[t.charAt(i) - 'a']--;
        }
        
        for(int j=0;j<fre.length;j++){
            if(fre[j]!=0){
                return false;
            }
        }

        return true;

    }
}