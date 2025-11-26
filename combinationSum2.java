class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    void helper(int ind,int[] candidates,int sum,int target,int n,ArrayList<Integer> temp){
        if(sum > target) return;
        if(ind == n){
            if(sum == target){
                
                ans.add(new ArrayList<>(temp));
                
                
            }
            return;
        }

        temp.add(candidates[ind]);
        sum += candidates[ind];
        helper(ind + 1,candidates,sum,target,n,temp);
        
        sum -= candidates[ind]; 
        temp.remove(temp.size()-1);

        int next = ind + 1;
        while (next < n && candidates[next] == candidates[ind]) {
            next++;
        }
       
        helper(next,candidates,sum,target,n,temp);

    }



    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        int n = candidates.length;
        ArrayList<Integer> temp = new ArrayList<>();
        helper(0,candidates,0,target,n,temp);
        return ans;
        
    }
}