class Solution {
    public int minCut(String s) {
        int[][] dp = new int[s.length()][s.length()];

        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        int res = helper(0,s.length()-1,s,dp);
        return res;
    }
    public static int helper(int i,int j,String s,int[][] dp){
        if(palindrome(i,j,s)){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int cnt = Integer.MAX_VALUE;

        for(int k=i;k<=j-1;k++){
            if(palindrome(i,k,s)){
                int cut = 1 + helper(k+1,j,s,dp);
                cnt = Math.min(cut,cnt);
            }
        }

        return dp[i][j] = cnt;
    }

    public static boolean palindrome(int i,int j,String s){
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    } 
}