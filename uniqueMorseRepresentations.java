class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set =new HashSet<>();
        String code[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for(String str : words){
            String str2 = "";
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                int val = ch - 97;

                str2 = str2 + code[val];

            }
            set.add(str2);
        }

        return set.size();
    }
}