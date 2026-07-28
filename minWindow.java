class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }

        int i = 0;
        int cnt = 0;
        int minLen = Integer.MAX_VALUE;
        int start = -1;

        for(int j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                if(map.get(s.charAt(j)) > 0){
                    cnt++;
                }
            }

            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0) - 1);

            while(cnt == t.length()){
                if(minLen > j - i + 1){
                    minLen = j - i + 1;
                    start = i;
                }

                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
                if(map.get(s.charAt(i)) > 0){
                    cnt--;
                }
                i++;
            }


        }

        if(minLen == Integer.MAX_VALUE){
            return "";
        }

        return s.substring(start,start + minLen);
    }
}