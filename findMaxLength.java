class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxVal = 0;
        map.put(0,-1);

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
            sum += nums[i];

            if(map.containsKey(sum)){
                maxVal = Math.max(maxVal,i-(map.get(sum)));
            }
            else{
                map.put(sum,i);
            }
        }

        return maxVal;

    }
}