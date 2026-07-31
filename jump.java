class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int l = 0;
        int r = 0;

        while(r < nums.length-1){
            int maxDis = 0;
            for(int i=l;i<=r;i++){
                maxDis = Math.max(maxDis,i + nums[i]);
            }
            l = r + 1;
            r = maxDis;
            jump++;
        }

        return jump;
    }
}