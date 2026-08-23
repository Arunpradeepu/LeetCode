class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r = obstacleGrid.length;
        int c = obstacleGrid[0].length;

        int[][] dp = new int[r][c];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        return helper(r-1,c-1,obstacleGrid,dp);
    }

    public static int helper(int ind1,int ind2,int[][] mat,int[][] dp){

        if(ind1 < 0 || ind1 > mat.length || ind2 < 0 || ind2 > mat[0].length){
            return 0;
        }

        if(mat[ind1][ind2] == 1){
            return 0;
        }

        if(ind1 == 0 && ind2 == 0){
            return 1;
        }

        if(dp[ind1][ind2] != -1){
            return dp[ind1][ind2];
        }

        int left = helper(ind1-1,ind2,mat,dp);
        int right = helper(ind1,ind2-1,mat,dp);

        return dp[ind1][ind2] = right + left;
    }
}