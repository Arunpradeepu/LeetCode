class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);

        int res = helper(cost.length-1,cost,dp);
        int res2 = helper(cost.length - 2, cost, dp);

        return Math.min(res,res2);
    }
    public static int helper(int n,int[] cost,int[] dp){
        if(n == 0){
            return cost[0];
        }

        if(n == 1){
            return cost[n]; 
        }
        if(dp[n] != -1){
            return dp[n];
        }
        

        int one = helper(n-1,cost,dp) + cost[n];

        int two = Integer.MAX_VALUE;

        if(n > 1){
            two = helper(n-2,cost,dp) + cost[n];
        }

        return dp[n] = Math.min(one,two);
    }
}