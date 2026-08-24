class Solution {
    public String reorganizeString(String s) {
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b) -> Integer.compare(b.getValue(),a.getValue()));
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            pq.offer(entry);
        }

        StringBuilder sb = new StringBuilder();
        while(pq.size()>1){
            char ch = pq.peek().getKey();
            int val = pq.peek().getValue()-1;
            pq.poll();

            char ch2 = pq.peek().getKey();
            int val2 = pq.peek().getValue()-1;
            pq.poll();

            sb.append(ch);
            sb.append(ch2);

            if(val > 0){
                pq.offer(new java.util.AbstractMap.SimpleEntry<>(ch,val));
            }
            if(val2 > 0){
                pq.offer(new java.util.AbstractMap.SimpleEntry<>(ch2,val2));
            }
        }

        if(pq.size() == 1){
            char ch = pq.peek().getKey();
            int freq = pq.peek().getValue();

            if(freq > 1){
                return "";
            }

            sb.append(ch);
        }
        return sb.toString();
    }
}