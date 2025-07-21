class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        stk.push(s.charAt(0));
        
        for(int i = 1;i < s.length();i++){
            char c = s.charAt(i);
            if(!stk.isEmpty() && stk.peek()==c){
                stk.pop();
            }
            else{
                stk.push(s.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        for(int j = 0;j<stk.size();j++){
            result.append(stk.get(j));
        }
        return result.toString();
    }
}