class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int consZeros = 0;
        long res = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                consZeros++;
            }
            else{
                consZeros = 0;
            }

            res += consZeros;
        }
        return res;
    }
}