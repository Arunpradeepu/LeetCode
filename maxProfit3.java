class Solution {
    public int maxProfit(int[] prices) {
        Integer[][][] dp = new Integer[prices.length][2][3];
        return helper(0,1,2,prices,dp);
    }
    public static int helper(int ind,int buy,int tran,int[] arr,Integer[][][] dp){

        if(ind == arr.length || tran == 0){
            return 0;
        }

        if(dp[ind][buy][tran] != null){
            return dp[ind][buy][tran];
        }


        int profit = Integer.MIN_VALUE;
        if(buy == 1){
            profit = Math.max(helper(ind + 1,0,tran,arr,dp)-arr[ind],helper(ind+1,1,tran,arr,dp));
        }
        else{
            profit = Math.max(helper(ind + 1,1,tran-1,arr,dp)+arr[ind],helper(ind+1,0,tran,arr,dp));
        }

        return dp[ind][buy][tran] = profit;
    }
}