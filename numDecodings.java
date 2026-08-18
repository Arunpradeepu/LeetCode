class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        Arrays.fill(dp,-1);

        int res = helper(0,s,dp);
        return res;
    }

    public static int helper(int ind,String s,int[] dp){

        if(ind == s.length()){
            return dp[ind] = 1;
        }

        if(s.charAt(ind) == '0'){
            return 0;
        }

        if(dp[ind] != -1){
            return dp[ind];
        }

        int one = helper(ind+1,s,dp);

        int two = 0;

        if(ind+1 < s.length()){
            int digit = Integer.parseInt(s.substring(ind,ind+2));
            if(1 <= digit && digit <= 26){
                two = helper(ind+2,s,dp);
            }
        }

        return dp[ind] = one + two;
    }
}