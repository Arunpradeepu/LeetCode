class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(a.getValue(),b.getValue())
        );

        HashMap<Integer,Integer> map = new HashMap<>();

        int[][] res = new int[k][2];

        for(int i=0;i<points.length;i++){
            int dis = (int) (Math.pow(Math.abs(0-points[i][0]),2) + Math.pow(Math.abs(0-points[i][1]),2));
            map.put(i,dis);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.offer(entry);
        }

        int i = 0;

        while(k > 0){
            res[i] = points[pq.poll().getKey()];
            k--;
            i++;
        }
        return res;
    }
}