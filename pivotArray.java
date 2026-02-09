class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> equl = new ArrayList<>();
        ArrayList<Integer> more = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i] < pivot){
                less.add(nums[i]);
            } 
            else if(nums[i] == pivot){
                equl.add(nums[i]);
            }
            else{
                more.add(nums[i]);
            }
        }

        int idx = 0;

        for(int x:less){
            nums[idx] = x;
            idx++;
        }

        for(int x : equl){
            nums[idx] = x;
            idx++;
        }

        for(int x:more){
            nums[idx] = x;
            idx++;
        }


        return nums;
    }
}