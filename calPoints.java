class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stk = new Stack<>();

        for(int i = 0;i < ops.length;i++){

            String op = ops[i];

            if(op.equals("C")){
                stk.pop();                          
            }
            else if(op.equals("D")){
                stk.push(stk.peek()*2);
            }

            else if(op.equals("+")){
                int last = stk.get(stk.size()-1);
                int seclast = stk.get(stk.size()-2);
                stk.push(last + seclast);                
            }
            else{
                int num = Integer.parseInt(op);
                stk.push(num);
            }            
        } 
        int tot = 0;
        for(int j=0;j<stk.size();j++){
            tot+=stk.get(j);
        } 
        return tot;      
    }
}