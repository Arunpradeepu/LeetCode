class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int[][] mat = new int[image.length][image[0].length];
        int[][] vis = new int[image.length][image[0].length];

        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                mat[i][j] = image[i][j];
                vis[i][j] = 0;
            }
        }


        helper(sr,sc,color,mat,vis,image[sr][sc]);

        return mat;
    }

    public static void helper(int ind1,int ind2,int color,int[][] mat,int[][] vis,int prev){

        if(ind1 < 0 || ind1 >= mat.length || ind2 < 0 || ind2 >= mat[0].length || vis[ind1][ind2] ==1){
            return;
        }

        if(mat[ind1][ind2] != prev){
            return;
        }

        vis[ind1][ind2] = 1;
        mat[ind1][ind2] = color;

        helper(ind1-1,ind2,color,mat,vis,prev);
        helper(ind1,ind2-1,color,mat,vis,prev);
        helper(ind1,ind2+1,color,mat,vis,prev);
        helper(ind1+1,ind2,color,mat,vis,prev);     
        
    }
}