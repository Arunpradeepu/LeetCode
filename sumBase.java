class Solution {
    public int sumBase(int n, int k) {

        int cnt = 0;
        int temp = n;
        int ans = 0;

       

        while(temp != 0){
           
            ans = ans + (temp % k);
            temp = temp / k;
        } 

        return ans;  
    }
}