class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1 = rev(num);
        int rev2 = rev(rev1);

        if(rev2 == num){
            return true;
        }
        return false;
    }

    static int rev(int num){
        int rev = 0;

        while(num >0){
            int ld = num % 10;
            rev = rev * 10 + ld;
            num /= 10;
        }
        return rev;
    }
}