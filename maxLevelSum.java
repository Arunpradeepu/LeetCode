/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int maxVal = Integer.MIN_VALUE;
        int val = 0;
        int level = 0;
        

        while(!q.isEmpty()){
            int sum = 0;
            level++;
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                sum += curr.val;

                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
            }

            if(maxVal < sum){
                maxVal = sum;
                val = level;
            }
        }

        return val;
        
    }
}