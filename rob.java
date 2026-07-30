class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);

        int res = helper(nums.length-1,nums,dp);
        return res;
    }

    public static int helper(int ind,int[] nums,int[] dp){
        if(ind < 0){
            return 0;
        }
        if(ind == 0){
            return dp[ind] =nums[ind];
        }

        if(dp[ind] != -1){
            return dp[ind];
        }

        int left = nums[ind] + helper(ind-2,nums,dp);
        int right = helper(ind-1,nums,dp);

        return dp[ind] = Math.max(left,right);

    }
}