class Solution {
    public long beautifulSubarrays(int[] nums) {
        int xor = 0;
        long cnt = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int val : nums){
            xor ^= val;

            if(map.containsKey(xor)){
                cnt += map.get(xor);
            }

            map.put(xor,map.getOrDefault(xor,0)+1);
        }

        return cnt;
    }
}