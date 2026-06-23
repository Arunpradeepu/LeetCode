class Solution {

    public int countLeft(TreeNode root,int[] ht){
        if(root == null){
            return 0;
        }

        ht[0] = ht[0] + 1;
        int l = countLeft(root.left,ht);
        return ht[0];
    }

    public int countRight(TreeNode root,int[] ht1){
        if(root == null){
            return 0;
        }

        ht1[0] = ht1[0] + 1;
        int l = countRight(root.right,ht1);
        return ht1[0];
    }

    public int countNodes(TreeNode root) {
        int[] ht = new int[1];
        int[] ht1 = new int[1];

        int leftHeight = countLeft(root,ht);
        int rightHeight = countRight(root,ht1);

        if(leftHeight == rightHeight){
            return ((int)Math.pow(2,ht[0])) - 1;
        }


        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}