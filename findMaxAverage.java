class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int j = 0;
        double sum = 0;
        double ans = Double.NEGATIVE_INFINITY;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];

            if(i-j+1 == k){
                double avg = sum / k;
                ans = Math.max(ans,avg);
                sum -= nums[j];
                j++;
            }
        }
        return ans;
    }
}