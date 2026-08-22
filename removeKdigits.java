class Solution {
    public String removeKdigits(String num, int k) {
        if(k == num.length()){
            return "0";
        }


        Stack<Integer> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<num.length();i++){
            int val = num.charAt(i) - '0';
            
            if(stk.isEmpty() || stk.peek() <= val){
                stk.push(val);
            }

            else{
                while(!stk.isEmpty() && k != 0 && stk.peek() > val){
                    stk.pop();
                    k--;
                }
                stk.push(val);
            }
        }

        while(!stk.isEmpty() && k > 0){
            stk.pop();
            k--;
        }

        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }

        int i = sb.length()-1;

        while(i > 0 && sb.charAt(i) == '0'){
            sb.deleteCharAt(i);
            i--;
        }

        return sb.reverse().toString();

    }

}