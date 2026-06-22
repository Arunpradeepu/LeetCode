class Solution {
    TreeNode startNode;

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

        return;

    }


    public void findNode(TreeNode root,int start){
        if(root == null){
            return;
        }

        if(root.val == start){
            startNode = root;
            return;
        }

        findNode(root.left,start);
        findNode(root.right,start);

    }


    public int amountOfTime(TreeNode root, int start) {
        HashMap<TreeNode,TreeNode> parent = new HashMap<>();
        getParent(parent,root); 

        Queue<TreeNode> queue = new LinkedList<>();
        
        HashSet<TreeNode> vis = new HashSet<>();

        findNode(root,start);

        queue.offer(startNode);
        vis.add(startNode);

        int ans = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            
            int flag = 0;

            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                
                if(curr.left != null && !vis.contains(curr.left)){
                    queue.offer(curr.left);
                    vis.add(curr.left);
                    flag = 1;
                }
                if(curr.right != null && !vis.contains(curr.right)){
                    queue.offer(curr.right);
                    vis.add(curr.right);
                    flag = 1;
                }
                if(parent.containsKey(curr) && !vis.contains(parent.get(curr))){
                    queue.offer(parent.get(curr));
                    vis.add(parent.get(curr));
                    flag = 1;
                }
            }

            if(flag == 1){
                ans++;
            }
        }

        return ans;

    }
}