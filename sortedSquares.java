class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int left = 0;
        int right = nums.length-1;
        int[] ans = new int[nums.length];
        int len = nums.length-1;

        while(left <= right){
            
            nums[left] = Math.abs(nums[left]);
            nums[right] = Math.abs(nums[right]);

            if(nums[left] > nums[right]){
                ans[len] = nums[left] * nums[left];
                left++;
            }
            else{
                ans[len] = nums[right] * nums[right];
               
                right--;
            }
            len--;
        }

        return ans;


    }
}