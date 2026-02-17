class Solution {
    public int maxProduct(int[] nums) {
        int maxPro = nums[0];
        int minPro = nums[0];
        int ans = nums[0];

        for(int i = 1;i<nums.length;i++){
            int tempMax = (int) Math.max(nums[i],(int)Math.max(maxPro*nums[i] , minPro*nums[i]));
            int tempMin = (int) Math.min(nums[i],(int)Math.min(maxPro*nums[i] , minPro*nums[i]));

            maxPro = tempMax;
            minPro = tempMin;

            if(ans < maxPro){
                ans = maxPro;
            }

        }

        return ans;
    }
}