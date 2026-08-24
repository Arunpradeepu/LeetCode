class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Integer.compare(b,a));

        for(int val : stones){
            pq.offer(val);
        }

        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();

            pq.offer(first - second);
        }

        return pq.poll();
    }
}