class Solution {
    public boolean canJump(int[] nums) {
        int maxRange = 0;
        for(int i=0;i<nums.length;i++){
            if(i > maxRange){
                return false;
            }
            maxRange = Math.max(maxRange,i + nums[i]);
            if (maxRange >= nums.length - 1) {
                return true;
            }            
        }
        return true;
    }
}