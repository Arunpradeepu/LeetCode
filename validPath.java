class Solution {
    List<ArrayList<Integer>> adj = new ArrayList<>();

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int ui = edge[0];
            int vi = edge[1];

            adj.get(ui).add(vi);
            adj.get(vi).add(ui);
        }

        boolean[] vis = new boolean[n];
        dfs(source,vis);

        return vis[destination];

    }

    public void dfs(int start,boolean[] vis){
        vis[start] = true;

        ArrayList<Integer> neg = adj.get(start);

        for(int val : neg){
            if(vis[val] == false){
                dfs(val,vis);
            }
        }
    }
}