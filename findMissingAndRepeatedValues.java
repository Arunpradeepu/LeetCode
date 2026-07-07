class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int dup = 0;
        int[] ans = new int[2];
       
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){

                if(!map.containsKey(grid[i][j])){
                    map.put(grid[i][j],1);
                }
                else{
                    dup = grid[i][j];
                    map.put(grid[i][j],map.getOrDefault(grid[i][j],0) + 1);
                }
            }
        }

        for(int i=0;i<=grid.length*grid.length;i++){
            if(map.getOrDefault(i,0) == 0){
                ans[1] = i;
            }
        }
     
        ans[0] = dup;
        return ans;
    }
}