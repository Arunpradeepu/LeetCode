class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] strArr = text.split(" ");
        HashMap<Character,Integer> map = new HashMap<>();
        int cnt = strArr.length;

        for(int i=0;i<brokenLetters.length();i++){
            map.put(brokenLetters.charAt(i) , 0);
        }

        for(String s : strArr){
            char[] chArr = s.toCharArray();
            for(int i=0;i<s.length();i++){
                if(map.containsKey((chArr[i]))){
                    cnt--;
                    break;
                }
            }
        }

        return cnt;
    }
}