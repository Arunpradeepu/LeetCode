class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        right[nums.length-1] = 1;

        int leftPre = 1;
        int rightPre = 1;

        for(int i=0;i<nums.length-1;i++){
            leftPre *= nums[i];
            left[i+1] = leftPre;
        }

        for(int i=nums.length-1;i>0;i--){
            rightPre *= nums[i];
            right[i-1] = rightPre;
        }

        for(int i=0;i<left.length;i++){
            int ans = left[i] * right[i];
            nums[i] = ans;
        }

        return nums;


    }
}