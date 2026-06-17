class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int val : arr){
            map.put(val,map.getOrDefault(val , 0) + 1);
        }

        int[] frqArr = new int[arr.length + 1];

        

       for(int freq : map.values()){
            if(frqArr[freq] == 0){
                frqArr[freq] = 1;
            }
            else{
                return false;
            }
        };

        return true;
    }
}