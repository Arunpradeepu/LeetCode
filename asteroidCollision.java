class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stk = new Stack<>();

        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i] > 0){
                stk.push(asteroids[i]);
            }
            else{

                while(!stk.isEmpty() && stk.peek() > 0 && stk.peek() < Math.abs(asteroids[i]) ){
                    if(stk.peek() < Math.abs(asteroids[i])){
                        stk.pop();
                    }
                }

                if(!stk.isEmpty() && stk.peek() > 0 && stk.peek() == Math.abs(asteroids[i])){
                    stk.pop();
                    continue;
                }

                if(stk.isEmpty() || stk.peek() < 0){
                    stk.push(asteroids[i]);
                }

                
            }
        }

        int[] ans = new int[stk.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i] = stk.peek();
            stk.pop();
        }

        return ans;
        
    }
}