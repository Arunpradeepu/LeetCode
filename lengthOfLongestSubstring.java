class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxVal = 0;
        int i = 0;
        Set<Character> set = new HashSet<>();
        for(int j=0;j<s.length();j++){
           
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
            }
            
            maxVal = Math.max(maxVal,set.size());
        }

        return maxVal;
    }
}