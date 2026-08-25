class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        int i = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        long sum = 0;
        long res = 0;

        for(int j=0;j<nums.size();j++){
            int val = nums.get(j);
            sum += val;

            map.put(val,map.getOrDefault(val,0)+1);

            if(j-i+1 == k){
                if(map.size() >= m){
                    res = Math.max(res,sum);
                }
                sum -= nums.get(i);
                map.put(nums.get(i),map.get(nums.get(i))-1);
                if(map.get(nums.get(i)) == 0){
                    map.remove(nums.get(i));
                }
                i++;
            }

        }

        return res;
    }

    
}