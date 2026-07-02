class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(int val : nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }

        for(int i=0;i<nums.length;i++){
            if(map.getOrDefault(nums[i],0) > 1 ){
                continue;
            }
            if(!map.containsKey(nums[i] - 1) && !map.containsKey(nums[i] + 1)){
                ans.add(nums[i]);
            }
        }

        return ans;
    }
}