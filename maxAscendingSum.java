class Solution {
    public int maxAscendingSum(int[] nums) {
    
        int sum = nums[0];
        int ans = nums[0];

        if(nums.length == 1){
            return nums[0];
        }


        for(int j=1;j<nums.length;j++){
           

            if(nums[j] > nums[j-1]){
                sum += nums[j];
            }
            else{
                sum = nums[j];
            }
            ans = Math.max(ans,sum);
            
            

        }
        return ans;
        
    }
}