class Solution {
    public boolean canPartition(int[] nums) {

        int sum = 0;
        for(int val : nums){
            sum += val;
        }
        if(sum % 2 != 0){
            return false;
        }

        int[][] dp = new int[nums.length][(sum/2) + 1];
        

        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        int res = helper(sum/2,nums,nums.length-1,dp);

        if(res == 1){
            return true;
        }

        return false;
    }

    public static int helper(int sum , int[] nums,int ind,int[][] dp){

        if(sum == 0){
            return 1;
        }

        if(ind == 0){
            if(nums[0] == sum){
                return 1;
            }
            return 0;
        }

        if(dp[ind][sum] != -1){
            return dp[ind][sum];
        }

        int notpick = helper(sum,nums,ind-1,dp);

        int pick = 0;

        if(nums[ind] <= sum){
            pick = helper(sum - nums[ind],nums,ind-1,dp);
        }

        int ans = Math.max(pick,notpick);

        if(ans == 1){
            dp[ind][sum] = 1;
            return 1;
        }

        dp[ind][sum] = 0;
        return 0;

        
        
    }
}