class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrap = new LinkedList<List<Integer>>();
        if(root==null){
            return wrap;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> sub = new LinkedList<Integer>();
            for(int i=0; i<size; i++){
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                sub.add(queue.poll().val);
            }
            wrap.add(sub);

        }
        return wrap;
    }
}