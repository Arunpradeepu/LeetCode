class Solution {
    public int findChampion(int[][] grid) {
        int ans = 0;
        int init = 0;
        for(int i=0;i<grid.length;i++){
            int cnt = 0;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    cnt++;
                }
            }
            if(cnt > init){
                init = cnt;
                ans = i;
            }
        }

        return ans;
    }
}