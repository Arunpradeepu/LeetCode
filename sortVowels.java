class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);


        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(isVowel(ch)){
                list.add(ch);
            }
        }

        Collections.sort(list);

        int j = 0;

        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(isVowel(ch)){
                sb.setCharAt(i,list.get(j++));
            }
        }

        return sb.toString();
        
    }
    public static boolean isVowel(char ch){
        String s = "aeiouAEIOU";

        if(s.indexOf(ch) != -1){
            return true;
        }
        return false;
    }
}