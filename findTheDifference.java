class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            int val = ch - 'a';

            freq[val]++;
        }

        for(char ch : t.toCharArray()){
            int val = ch - 'a';

            freq[val]--;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i] < 0){
                char res = (char)(i + 'a');
                return res;
            }
        }

        return 'a';

        
    }
}