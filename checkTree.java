class Solution {
    public boolean checkTree(TreeNode root) {
        int parentVal = root.val;
        int[] sum = new int[1];
        int[] tot = helper(root,sum);

        return tot[0] - parentVal == parentVal;
    }

    public int[] helper(TreeNode root,int[] sum){
        if(root == null){
            return sum;
        }

        sum[0] += root.val;

        int[] l = helper(root.left,sum);
        int[] r = helper(root.right,sum);

        return sum;
    }
}