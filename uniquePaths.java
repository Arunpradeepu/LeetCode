class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];

        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        return helper(m-1,n-1,dp);
    }
    public static int helper(int ind1,int ind2,int[][] dp){

        if(ind1 < 0 || ind2 < 0){
            return 0;
        }

        if(ind1 == 0 && ind2 == 0){
            return 1;
        }

        if(dp[ind1][ind2] != -1){
            return dp[ind1][ind2];
        }

        int left = helper(ind1,ind2-1,dp);
        int right = helper(ind1-1,ind2,dp);

        return dp[ind1][ind2] = left + right;
    }
}