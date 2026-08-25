class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k) - atmost(nums,k-1);
    }

    public static int atmost(int[] arr,int k){
        int i = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0;

        for(int j=0;j<arr.length;j++){
            int val = arr[j];
            map.put(val,map.getOrDefault(val,0)+1);

            while(map.size() > k){
                map.put(arr[i],map.getOrDefault(arr[i],0)-1);
                if(map.get(arr[i]) == 0){
                    map.remove(arr[i]);
                }
                i++;
            }

            res += j - i + 1;            
        }

        return res;
    }
}