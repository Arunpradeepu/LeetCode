class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                stk.push(')');
            }
            else if(c == '['){
                stk.push(']');
            }
            else if(c == '{'){
                stk.push('}');
            }
            else if(stk.isEmpty() || stk.pop() != c){
                return false;
            }
        }
        return stk.isEmpty();
    }
}