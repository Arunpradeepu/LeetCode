class Solution {
    public void rotate(int[][] matrix) {

        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                if(i != j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            rev(matrix[i]);
        }
    }

    public static void rev(int[] arr){
        int l = 0;
        int r = arr.length-1;

        while(l <= r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}