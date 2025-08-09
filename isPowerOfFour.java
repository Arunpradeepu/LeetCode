class Solution {
    public boolean isPowerOfFour(int n) {
        return check(n,0);
    }
    public boolean check(int n,int i){
        if(Math.pow(4,i)==n){
            return true;
        }
        if(Math.pow(4,i)>n){
            return false;
        }
        return check(n,i+1);
    }
}