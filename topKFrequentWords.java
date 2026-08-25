class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(
            (a,b) -> {
                if(b.getValue() != a.getValue()){
                    return Integer.compare(b.getValue(),a.getValue());
                }    
                return a.getKey().compareTo(b.getKey()); 
            }                   
        );

        List<String> res = new ArrayList<>();

        HashMap<String,Integer> map = new HashMap<>();

        for(String str : words){
            map.put(str,map.getOrDefault(str,0) + 1);
        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            pq.offer(entry);
        }

        while(k > 0){
            res.add(pq.poll().getKey());
            k--;
        }
        return res;
    }
}