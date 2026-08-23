class Solution {
    public boolean canCross(int[] stones) {
        int[][] dp = new int[stones.length][stones.length];

        for(int arr[] : dp){
            Arrays.fill(arr,-1);
        }

        return helper(0,0,stones,dp);
    }

    public static boolean helper(int ind,int jump,int[] arr,int[][] dp){
        if(ind == arr.length - 1){
            return true;
        }

        if(dp[ind][jump] != -1){
            return dp[ind][jump] == 1;
        }

        

        for(int i = jump-1;i<=jump+1;i++){
            if(i <= 0) continue;
            int nextJump = arr[ind] + i;
            int nextIndex = Arrays.binarySearch(arr,nextJump);

            if(nextIndex >= 0){
                if(helper(nextIndex,i,arr,dp)){
                    dp[ind][jump] = 1;
                    return true;
                }
            }
        }

        dp[ind][jump] = 0;

        return false;
    }
}