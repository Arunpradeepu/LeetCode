class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int start = -1,len = 0,maxlen = 0;

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int num : set){
            
            if(set.contains(num-1) == false){
                start = num;
                int cur = start;
                len = 1;

                while(set.contains(cur+1)){
                    cur++;
                    len++;
                }
                maxlen = (Math.max(len,maxlen));
            }

            


        }
        return maxlen;
    }
}