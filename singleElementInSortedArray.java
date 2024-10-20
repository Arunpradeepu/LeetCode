class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;

        if(n==1){
            return nums[0];
        }
        if(n==0){
            return -1;
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }

        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        } 
        int l=1;
        
        int r=n-2;       

        while(l<=r){
            int mid=(l+r)/2;



            

            if(mid%2==0){
                if(nums[mid]==nums[mid+1]){
                    l=mid+2;
                }
                else{
                    r=mid-1;
                }
            }

            else{
                if(nums[mid]==nums[mid-1]){
                    l=mid+1;               
                }
                else{
                    r=mid-1;
                }
            }

        }
        return nums[l];
    }    
}