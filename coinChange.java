class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        int res = helper(coins.length-1,coins,amount,dp);

        if(res == 1000000000){
            return -1;
        }

        return res;
    }
    public static int helper(int ind,int[] coins,int target,int[][] dp){
        if(ind == 0){
            if(target % coins[ind] == 0){
                return target / coins[ind];
            }
            return (int) 1e9;
        }

        

        if(dp[ind][target] != -1){
            return dp[ind][target];
        }

        int notPick = helper(ind-1,coins,target,dp);
        int pick = (int) 1e9;

        if(coins[ind] <= target){
            pick = 1 + helper(ind,coins,target-coins[ind],dp);
        }

        return dp[ind][target] = Math.min(pick,notPick);
    }
}