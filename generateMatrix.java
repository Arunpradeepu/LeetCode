class Solution {
    public int[][] generateMatrix(int n) {

        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        int[][] matrix = new int[n][n];
        int val = 1;

        while(left <= right && top <= bottom){
            for(int i=left;i<=right;i++){
                matrix[top][i] = val++;
            }
            top++;

            for(int i=top;i<=bottom;i++){
                matrix[i][right] = val++; 
            }
            right--;

            if(left <= right){
                for(int i=right;i>=left;i--){
                    matrix[bottom][i] = val++;
                }
                bottom--;
            }


            if(top <= bottom){
                for(int i=bottom;i>=top;i--){
                    matrix[i][left] = val++;
                }
                left++;
            }


        }

        return matrix;
        
    }
}