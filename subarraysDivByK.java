class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int ans = 0;
        int sum = 0;
        
        for(int j = 0;j<nums.length;j++){
            sum += nums[j];
            
            if(map.containsKey(((sum % k) + k) % k)){
                ans += map.get(((sum % k) + k) % k);
            }
            
            map.put(((sum % k) + k) % k,map.getOrDefault(((sum % k) + k) % k,0)+1);
            

        }
        return ans;
    }
}