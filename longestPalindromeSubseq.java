class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder(s);

        int[][] dp = new int[s.length()][s.length()];

        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        
        int res = helper(s.length()-1,s.length()-1,s,sb.reverse().toString(),dp);
        return res;
        
    }

    public static int helper(int i,int j,String s1,String s2,int[][] dp){

        if(i < 0 || j < 0){
            return 0;
        }

        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] = 1 + helper(i-1,j-1,s1,s2,dp);
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int left = helper(i-1,j,s1,s2,dp);
        int right = helper(i,j-1,s1,s2,dp);

        return dp[i][j] = Math.max(left,right);
    }
}