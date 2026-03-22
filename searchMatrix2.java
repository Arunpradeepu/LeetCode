class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int flag = 0;
        for(int i=0;i<matrix.length;i++){
            flag += search(matrix[i],target);
        }
        if(flag == 0){
            return false;
        }
        return true;
        
    }
    int search(int arr[],int x){
        int l = 0;
        int r = arr.length-1;
        int ans = 0;

        while(l <= r){
            int mid = (l + r)/2;

            if(arr[mid] == x){
                ans = 1;
                return ans;
            }
            else if(arr[mid] > x){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return ans;
    }
}