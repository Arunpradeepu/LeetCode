class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];

        for(int arr[] : dp){
            Arrays.fill(arr,-1);
        }

        int res = helper(word1.length()-1,word2.length()-1,word1,word2,dp);
        return res;
    }

    public static int helper(int i,int j,String word1,String word2,int[][] dp){

        if(i < 0){
            return j+1;
        }
        if(j < 0){
            return i+1;
        }

        if(word1.charAt(i) == word2.charAt(j)){
            return dp[i][j] = helper(i-1,j-1,word1,word2,dp);
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int replace = 1 + helper(i-1,j-1,word1,word2,dp);
        int insert = 1 + helper(i,j-1,word1,word2,dp);
        int delete = 1 + helper(i-1,j,word1,word2,dp);
    
        return dp[i][j] = Math.min(replace,Math.min(insert,delete));
    }
}