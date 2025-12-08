class Solution {
    static List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0);
        return ans;
    }
    static void helper(int[] nums,int ind){
        
        if(ind == nums.length-1){
            ArrayList<Integer> ds = new ArrayList<>();
            for(int x : nums){
                ds.add(x);
            }
            ans.add(ds);
            return;
        }

        for(int i=ind;i<nums.length;i++){
            
            boolean skip = false;
            for (int j = ind; j < i; j++) {
                if (nums[j] == nums[i]) {
                    skip = true;
                    break;
                }
            }
            if (skip) continue;


            swap(nums,i,ind);
            helper(nums,ind+1);
            swap(nums,i,ind);
        }

    }
    static void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;


    }
}