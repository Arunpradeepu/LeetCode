class Solution {
    public int rob(int[] nums) {
        int[] dp1 = new int[nums.length];
        Arrays.fill(dp1,-1);
        int[] dp2 = new int[nums.length];
        Arrays.fill(dp2,-1);

        if(nums.length == 1){
            return nums[0];
        }


        int res = helper(nums.length-2,nums,0,dp1);

        int res2 = helper(nums.length-1,nums,1,dp2);

        return Math.max(res,res2);
    }

    public static int helper(int n,int[] nums,int end,int[] dp){
        if(n == end){
            return nums[end];
        }
        if(n < end){
            return 0;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int rob = Integer.MIN_VALUE;

        if(n > end){
            rob = helper(n-2,nums,end,dp) + nums[n];
        }
        

        int notRob = helper(n-1,nums,end,dp);

        return dp[n] = Math.max(rob,notRob); 
    }
}