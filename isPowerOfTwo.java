class Solution {
    public boolean isPowerOfTwo(int n) {
        
        
        return ret(n,0);
    }
    public boolean ret(int n,int i){
        if(Math.pow(2,i)==n){
            return true;
        }
        if(Math.pow(2,i)>n){
            return false;
        }
        return ret(n,i+1);

    }
    
}