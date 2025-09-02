class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int el = nums[0];
        for(int i=0;i<nums.length;i++){

            if(cnt==0 && i>0){
                el=nums[i];                
                
            }
            if(nums[i] == el){
                cnt++;
            }
            
            else if(nums[i] != el){
                cnt--;
            }
            


        }
        return el;
        
    }
}