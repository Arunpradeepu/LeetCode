class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][];

        for (int i = 0; i < n; i++) {
            dp[i] = new int[triangle.get(i).size()];
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }

        int res = helper(0,0,triangle,dp);
        return res;
    }

    public static int helper(int ind1,int ind2,List<List<Integer>> nums,int[][] dp){
        if(ind1 == nums.size() -1){
            return dp[ind1][ind2] = nums.get(ind1).get(ind2);
        }

        if(dp[ind1][ind2] != Integer.MIN_VALUE){
            return dp[ind1][ind2];
        }

        int left = helper(ind1 + 1,ind2,nums,dp) + nums.get(ind1).get(ind2);
        int right = helper(ind1 + 1,ind2+1,nums,dp) + nums.get(ind1).get(ind2);

        return dp[ind1][ind2] = Math.min(left,right);
    }
}