class Solution {
    
    public int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;

        helper(root,max);

        return max[0];
    }
    public static int helper(TreeNode root,int max[]){
        if(root == null){
            return 0;
        }

        int lh = Math.max(0,helper(root.left,max));
        int rh = Math.max(0,helper(root.right,max));

        

        max[0] = Math.max( max[0],root .val + lh + rh);

        return root.val + Math.max(lh,rh);

    }
}