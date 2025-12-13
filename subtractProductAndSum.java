class Solution {
    public int subtractProductAndSum(int n) {
        int a = pro(n);
        int b = sum(n);

        return a-b;
    }
    static int pro(int n){
        int pro = 1;

        while(n>0){
            int ld = n % 10;
            pro *= ld;
            n /= 10;
        }
        return pro;
    }

    static int sum(int n){
        int sum = 0;

        while(n>0){
            int ld = n % 10;
            sum += ld;
            n /= 10;
        }
        return sum;
    }
}