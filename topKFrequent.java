class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.getValue(),b.getValue()));
        int[] res = new int[k];
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int val : nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.offer(entry);

            if(pq.size() > k){
                pq.poll();
            }
        }

        int i = 0;

        while(!pq.isEmpty()){
            Map.Entry<Integer,Integer> entry = pq.poll();
            res[i] = entry.getKey();
            i++;
            k--;
        }

        return res;
    }
}