class Solution {
    int ans = 0;
    public int findTargetSumWays(int[] nums, int target) {
        
        helper(nums,target,0,0);
        return ans;
    }

    void helper(int[] nums,int target,int sum,int ind){
        if(ind == nums.length){
            if(sum == target){
                ans++;
            }
            return ;

        }

        
        helper(nums,target,sum + nums[ind],ind+1);

        
        helper(nums,target,sum - nums[ind],ind+1);
       





    }
}