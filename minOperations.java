class Solution {
    public int minOperations(int[] nums, int k) {
        int tot = 0;
        for(int val : nums){
            tot += val;
        }
        return tot % k;
    }
}