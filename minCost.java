class Solution {
    public int minCost(int n, int[] cuts) {

        int[] index = new int[cuts.length+2];
        int[][] dp = new int[index.length+1][index.length+1];

        for(int arr[] : dp){
            Arrays.fill(arr,-1);
        }

        index[0] = 0;
        index[cuts.length + 1] = n;

        for(int i=0;i<=cuts.length-1;i++){
            index[1 + i] = cuts[i];
        }

        Arrays.sort(index);

        int res = helper(0,index.length-1,index,dp);
        return res;
    }

    public static int helper(int ind1,int ind2,int[] index,int[][] dp){
        if(ind1+1==ind2) return 0; 
        if(dp[ind1][ind2] != -1){
            return dp[ind1][ind2];
        }

        int res = Integer.MAX_VALUE;
        for(int k=ind1+1;k<ind2;k++){
            int ans = helper(ind1,k,index,dp) + helper(k,ind2,index,dp) + index[ind2] - index[ind1];
            res = Math.min(res,ans);
        }
        return dp[ind1][ind2] = res;
    }
}