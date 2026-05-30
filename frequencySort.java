class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> freq = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        
        List<Character>[] bucket = new ArrayList[s.length()+1];

        for(char ch : freq.keySet()){
            int cnt = freq.get(ch);

            if(bucket[cnt] == null){
                bucket[cnt] = new ArrayList<>();
            }

            bucket[cnt].add(ch);
        }

        StringBuilder sb = new StringBuilder();

        for(int i=s.length();i>0;i--){
            if(bucket[i] != null){
                for(char ch : bucket[i]){
                    for(int j=0;j<i;j++){
                        sb.append(ch);
                    }
                }
            }
        }

        return sb.toString();

    }
}