class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>();

        int[][] dp = new int[s.length()][s.length()];

        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        for(String words : wordDict){
            set.add(words);
        }

        boolean res = helper(0,s.length()-1,s,set,dp);
        return res;

        
    }

    public static boolean helper(int i,int j,String s,HashSet<String> set,int[][] dp){
        if(set.contains(s.substring(i,j+1))){
            return true;
        }

        if(dp[i][j] != -1){
            if(dp[i][j] == 1){
                return true;
            }
            return false;
        }


        for(int k=i;k<=j-1;k++){
            String temp = s.substring(i,k+1);
            if(set.contains(temp)){
                if(helper(k+1,j,s,set,dp)){
                    dp[i][j] = 1;
                    return true;
                }
            }
        }

        dp[i][j] = 0;

        return false;
    }
}