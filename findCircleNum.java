class Solution {
    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;
        boolean[] vis = new boolean[n];

        int ans = 0;

        for(int i=0;i<n;i++){
            if(vis[i] == false){
                dfs(i,vis,isConnected);
                ans++;
            }
        }   

        return ans;
    }

    public static void dfs(int i,boolean[] vis,int[][] isConnected){
        int n = isConnected.length;
        vis[i] = true;
        
        for(int j=0;j<n;j++){
            if(isConnected[i][j] == 1 && vis[j] != true){
                dfs(j,vis,isConnected);
            }
        }
        

    }
}