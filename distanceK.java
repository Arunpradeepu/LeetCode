class Solution {

    public static void getParent(HashMap<TreeNode,TreeNode> parent,TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode current = queue.poll();

            if(current.left != null){
                queue.offer(current.left);
                parent.put(current.left,current);
            } 

            if(current.right != null){
                queue.offer(current.right);
                parent.put(current.right,current);
            } 
        }
    }


    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode> parent = new HashMap<>();
        getParent(parent,root);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(target);
        int dis = 0;
        HashSet<TreeNode> vis = new HashSet<>();
        vis.add(target);

        while(!queue.isEmpty()){
            
            if(dis == k){
                break;
            }

            dis++;
            int size = queue.size();

            for(int i=0;i<size;i++){
                TreeNode current = queue.poll();

                if(current.left != null && vis.contains(current.left) == false){
                    queue.offer(current.left);
                    vis.add(current.left);
                }

                if(current.right != null && vis.contains(current.right) == false){
                    queue.offer(current.right);
                    vis.add(current.right);
                }

                if(parent.containsKey(current) && !vis.contains(parent.get(current))){
                    queue.offer(parent.get(current));
                    vis.add(parent.get(current));
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            ans.add(curr.val);
        }

        return ans;

    }
}