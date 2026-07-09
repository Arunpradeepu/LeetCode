class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int sum = 0;
        for(int val: nums){
            sum += isFound(val,digit);
        }
        return sum;
    }

    public static int isFound(int val,int digit){
        int cnt = 0;
        while(val > 0){
            int last = val % 10;
            val = val /10;
            if(digit == last){
                cnt++;
            }
        }
        return cnt;
    }
}