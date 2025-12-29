class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int end = mat[0].length-1; 
        
        
        for(int i=0;i<mat.length;i++){
            for(int j=i;j<mat[i].length;j++){
                  

                if(j == end){
                    sum = sum + mat[i][j];
                }
                else {
                    sum = sum + mat[i][j] + mat[i][end];
                } 
                end--;   
                                         
                break;             
            }
        }

        return sum;
    }
}