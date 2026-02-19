class Solution {
    public int reverse(int x) {
        long ans = 0;
        long limit =  1L << 31;
        

        while(x != 0){
            
            int ld = x % 10;
            ans = ans * 10 + ld;

            if(ans >= limit || ans < -limit){
                return 0;
            }
            
            x/= 10;
        }
        
        return (int) ans;
        
    }
}