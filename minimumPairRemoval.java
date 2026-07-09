class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();  
        int ans = 0;      

        for(int val : nums){
            list.add(val);
        }

        if(isSort(list)){
            return 0;
        }

        while(!isSort(list)){
            
            int minVal = Integer.MAX_VALUE;
            int targetIndex = -1;

            for(int i=0;i<list.size()-1;i++){
                int sum = list.get(i) + list.get(i+1);
                
                if(minVal > sum){
                    minVal = sum;
                    targetIndex = i;
                }
            }

            list.remove(targetIndex + 1);
            list.remove(targetIndex);
            list.add(targetIndex,minVal);
            ans++;
        }

        return ans;

        
    }
    public static boolean isSort(ArrayList<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i) > list.get(i+1)){
                return false;
            }
        }
        return true;
    }
}