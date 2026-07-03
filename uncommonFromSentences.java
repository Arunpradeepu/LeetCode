class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        ArrayList<String> ans = new ArrayList<>();
        

        HashMap<String,Integer> map = new HashMap<>();

        for(String s : arr1){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for(String s : arr2){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                ans.add(entry.getKey());
            }
        }

        return ans.toArray(new String[0]);


    }
}