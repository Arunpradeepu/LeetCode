class Solution {
    public int pivotIndex(int[] nums) {
        int ts = 0;
        int sum1 = 0;
        int sum2 = 0;
        int j =0;

        for(int i=0;i<nums.length;i++){
            ts = ts + nums[i];
        }

        while(j < nums.length){
            sum1 = ts - nums[j] - sum2;

            if(sum1 == sum2){
                return j;
            }
            
            sum2 += nums[j];
            j++;
        }

        return -1;


    }
}