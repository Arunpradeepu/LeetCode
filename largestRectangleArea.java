class Solution {
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
