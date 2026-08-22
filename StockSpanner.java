class StockSpanner {
    private Stack<int[]> stk = new Stack<>();
    private int ind = -1;

    public StockSpanner() {
        ind = -1;
        stk.clear();
    }
    
    public int next(int price) {
        ind++;
        while(!stk.isEmpty() && stk.peek()[0] <= price){
            stk.pop();
        }
        int ans;
        if(stk.isEmpty()){
            ans = ind + 1;
        } 
        else{
            ans = ind - stk.peek()[1];
        }

        stk.push(new int[]{price,ind});

        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */