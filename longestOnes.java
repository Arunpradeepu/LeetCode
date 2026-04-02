class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0,max1 =0,cnt=0;
        for(int j = 0;j<nums.length;j++){
            if(nums[j] == 1){
                cnt++;
            }
            if(nums[j] == 0){
                k--;
                cnt++;
            }

            while( k <0){
                if(nums[i] == 0){
                    k++;
                }
                i++;
                cnt--;
            }
            max1 = Math.max(max1,cnt);
        }

        return max1;
        
    }
}