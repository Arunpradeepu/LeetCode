class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][nums.length+1];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        int res = helper(0,-1,nums,dp);
        return res;
    }

    public static int helper(int ind,int prev,int[] nums,int[][] dp){

        if(ind == nums.length){
            return 0;
        }

        if(dp[ind][prev+1] != -1){
            return dp[ind][prev+1];
        }

        int take = 0;

        if(prev == -1 || nums[ind] > nums[prev]){
            take = helper(ind+1,ind,nums,dp) + 1;
        }

        int notTake = helper(ind+1,prev,nums,dp);

        return dp[ind][prev + 1] = Math.max(take,notTake);
    }
}