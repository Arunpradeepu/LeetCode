class Solution {
    public boolean isBalanced(TreeNode root) {

        return checkHt(root)!=-1;



    }
        private int checkHt(TreeNode node){
        if(node == null) return 0;

        int lh = checkHt(node.left);
        if(lh == -1){
            return -1;
        }

        int rh = checkHt(node.right);
        if(rh == -1){
            return -1;
        }
        

        if(Math.abs(lh-rh)>1) return -1;

        return Math.max(lh,rh)+1;            
        }
        
}