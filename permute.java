class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    boolean[] visited;

    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        visited = new boolean[nums.length];
        helper(nums,temp,0);
        return ans;
    }
    Boolean helper(int[] nums,ArrayList<Integer> temp,int ind){
        
        if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
            return true;
        }
            
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i] = true;
                temp.add(nums[i]);
                helper(nums,temp,ind+1);
                temp.remove(temp.size()-1);
                
                visited[i] = false;
            }
        }


        
        
        return false;
    }
}