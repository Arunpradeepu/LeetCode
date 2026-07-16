class Solution {
    public int climbStairs(int n) {
        int[] res = new int[n+1];

        for(int i=0;i<n+1;i++){
            res[i] = -1;
        }

        int ans = helper(n,res);
        return ans;

       
    }

    public static int helper(int n,int[] res){
        if(n <= 1){
            return 1;
        }

        if(res[n] != -1){
            return res[n];
        }
        
        return res[n] = helper(n - 1,res) + helper(n - 2,res); 
    }
}