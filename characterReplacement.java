class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();

        int j = 0;
        int maxFreq = 0;
        int res = 0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            map.put(ch,map.getOrDefault(ch,0) + 1);

            maxFreq = Math.max(maxFreq,map.get(ch));

            while((i-j+1) - maxFreq > k){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                maxFreq = 0;

                for(int val : map.values()){
                    maxFreq = Math.max(maxFreq,val);
                }
                // for(Map.Entry<Character,Integer> entry : map.entrySet()){
                //     maxFreq = Math.max(maxFreq,entry.getValue());
                // }
                j++;
            }

            res = Math.max(res,i-j+1);

        }
        return res;
    }
}