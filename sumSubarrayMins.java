class Solution {
    public int sumSubarrayMins(int[] arr) {
        long sum = 0;
        long mod = (long)Math.pow(10,9) + 7;
        int[] leftArr = left(arr);
        int[] rightArr = right(arr); 
               
        for(int i=0;i<arr.length;i++){

            long cont = (long) arr[i] * (i - leftArr[i]) * (rightArr[i] - i);
            sum += cont; 
            sum = sum % mod;

        }
        return (int)sum;
    }

    public static int[] left(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int[] pse = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            while(!stk.isEmpty() && arr[i] <= arr[stk.peek()] ){
                stk.pop();
            }
            
            pse[i] = stk.isEmpty() ? -1 : stk.peek();


            stk.push(i);
        }

        return pse;
    }

    public static int[] right(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int[] nse = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            while(!stk.isEmpty() && arr[i] < arr[stk.peek()] ){
                stk.pop();
            }
            
            nse[i] = stk.isEmpty() ? arr.length : stk.peek();


            stk.push(i);
        }

        return nse;
    }
}