class Solution {
    public int maxProfit(int[] prices) {
        Integer[][] dp = new Integer[prices.length][2];
        return helper(0,1,prices,dp);
    }

    public static int helper(int ind,int buy,int[] arr,Integer[][] dp){
        if(ind == arr.length){
            return 0;
        }

        if(dp[ind][buy] != null){
            return dp[ind][buy];
        }

        int profit = Integer.MIN_VALUE;

        if(buy == 1){
            profit = Math.max(helper(ind+1,1,arr,dp),helper(ind+1,0,arr,dp) - arr[ind]);
        }
        else{
            profit = Math.max(helper(ind+1,1,arr,dp) + arr[ind],helper(ind+1,0,arr,dp));
        }

        return dp[ind][buy] = profit;
    }
}