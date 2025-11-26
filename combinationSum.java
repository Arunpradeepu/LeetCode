class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> temp = new ArrayList<>();
        
        helper(candidates,0,target,temp);
        return ans;
    }

    void helper(int[] candidates,int ind,int target,ArrayList<Integer> temp){
        
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(ind == candidates.length || target < 0){
            return;
        }

        temp.add(candidates[ind]);        
        helper(candidates,ind,target - candidates[ind],temp);

        
        temp.remove(temp.size() - 1);
        helper(candidates,ind+1,target,temp);
    }
}