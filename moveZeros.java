class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> a = new ArrayList<>(); 
        ArrayList<Integer> b = new ArrayList<>();  
        for (int i=0;i<n;i++){
            if (nums[i]!=0){
                a.add(nums[i]);
            }

            else{
                b.add(nums[i]);
            }
            

        }
        for (int i = 0; i < a.size(); i++) {
            nums[i] = a.get(i); 
        }
        
       
        for (int i = a.size(); i < n; i++) {
            nums[i] = 0; 
        }
    }
}