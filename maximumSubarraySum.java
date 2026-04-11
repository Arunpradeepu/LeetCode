class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        int i = 0;
        long sum = 0;
        long ans = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int j=0;j<nums.length;j++){
            while(set.contains(nums[j])){
                set.remove(nums[i]);
                sum -= (long) nums[i];
                i++;
            }
            
            if(!set.contains(nums[j])){
                set.add(nums[j]);
                sum += (long) nums[j];
            }

            

            if(j-i+1 == k){
                ans = Math.max(sum,ans);
                sum -= (long) nums[i];
                set.remove(nums[i]);
                i++;
            }

        }

        return ans;
        
    }
}