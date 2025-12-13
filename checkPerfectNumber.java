class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num <=1){
            return false;
        }
        int sum = factor(num);

        if(sum == num){
            return true;
        }
        return false;
    }

    static int factor(int num){
        int sum = 1;


        for(int i=2;i*i<=num;i++){
            if(num % i == 0){
                sum += i;
                if(i != num/i){
                    sum += num/i;
                }
            }
        }

        return sum;
    }
}