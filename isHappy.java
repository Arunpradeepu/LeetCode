class Solution {
    public boolean isHappy(int n) {
        
        int ans = sumOfDigit(n);
        

        while(ans > 9 || ans == 7){
            ans = sumOfDigit(ans);
        }

        if(ans == 1){
            return true;
        }

        return false;

        

    }
    static int sumOfDigit(int num){
        int sum = 0;
        while(num >0){
            int ld = num % 10;
            sum = sum + (ld*ld);
            num /= 10;
        }
        return sum;
    }
}