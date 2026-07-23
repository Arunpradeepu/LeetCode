class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for(int val : arr){
            if(val % 2 == 0){
                if(set.contains(val/2)){
                    return true;
                }
            }
            if(set.contains(val * 2)){
                return true;
            }
            set.add(val);
        }

        return false;
        
    }
}