class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = sumOfDigit(x);

        if(x % sum == 0){
            return sum;
        }

        return -1;

    }

    public static int sumOfDigit(int n){
        int sum = 0;

        while(n > 0){
            int ld = n % 10;
            sum += ld;
            n /= 10;
        }

        return sum;
    }
}