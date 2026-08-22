class Solution {
    public int maximalRectangle(char[][] matrix) {

        int temp[] =new int[matrix[0].length];
        int res = Integer.MIN_VALUE;

        for(int ind=0;ind<matrix.length;ind++){
            for(int i=0;i<matrix[0].length;i++){
                if(matrix[ind][i] == '1'){
                    temp[i] = temp[i] + 1;
                }
                else{
                    temp[i] = 0;
                }
            }
            int curr = largestRectangleArea(temp);
            res = Math.max(res,curr);
        }
        return res;
    }

    public int largestRectangleArea(int[] heights) {
        int[] nse = nse(heights);
        int res = Integer.MIN_VALUE;

        Stack<Integer> stk = new Stack<>();
        int[] pse = new int[heights.length];

        for(int i=0;i<heights.length;i++){

            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i]){
                stk.pop();
            }

            if(stk.isEmpty()){
                pse[i] = -1;
            }
            else{
                pse[i] = stk.peek();
            }
            
            stk.push(i);

            int curr = heights[i] * (nse[i] - pse[i] -1);
            res = Math.max(res,curr);
        }

        return res;
    }

    public static int[] nse(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int[] nse = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){

            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i]){
                stk.pop();
            }

            if(stk.isEmpty()){
                nse[i] = arr.length;
            }
            else{
                nse[i] = stk.peek();
            }

            stk.push(i);
        }
        return nse;
    }
}