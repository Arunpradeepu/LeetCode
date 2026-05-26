class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[nums.length];

        for(int i=nums.length*2-1; i>=0; i--){
            int ind = i % nums.length;

            while(!stk.isEmpty() && stk.peek() <= nums[ind]){
                stk.pop();
            }

            if(i < nums.length){
                if(stk.isEmpty()){
                    ans[ind] = -1;
                }
                else{
                    ans[ind] = stk.peek();
                }
            }
            
            stk.add(nums[ind]);

        }

        return ans;
    }
}