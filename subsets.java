class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        helper(nums,0,temp);
        return ans;
        
    }

    void helper(int[] nums,int ind,ArrayList<Integer> temp){
        if(ind == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        temp.add(nums[ind]);
        helper(nums,ind+1,temp);

        temp.remove(temp.size()-1);
        helper(nums,ind+1,temp);
    }
}