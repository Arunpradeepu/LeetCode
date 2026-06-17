class Solution {
    public int totalFruit(int[] fruits) {
        int j = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;

        for(int i=0;i<fruits.length;i++){

            if(!map.containsKey(fruits[i])){
                map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            }

            else{
                map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            }

            while(map.size() > 2){

                map.put(fruits[j],map.getOrDefault(fruits[j],0)-1);

                if(map.get(fruits[j]) == 0){
                    map.remove(fruits[j]);
                }
                
                j++;
            }
            ans = Math.max(ans,i-j+1);
        }
        return ans;
    }
}