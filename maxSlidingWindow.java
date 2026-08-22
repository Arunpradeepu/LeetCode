class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i = 0;
        Deque<Integer> que = new ArrayDeque<>();
        int[] res = new int[nums.length - k + 1];
   

        for(int j=0;j<nums.length;j++){
            while(!que.isEmpty()  && nums[j] > nums[que.getLast()]){
                que.pollLast();
            }
            que.addLast(j);

            if(j - i + 1 == k){
                if(que.getFirst() < j - k + 1){
                    que.removeFirst();
                }
                res[i] = nums[que.getFirst()];
                i++;
            }
        }

        return res;
    }
}