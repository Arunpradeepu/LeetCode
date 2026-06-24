class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
    
    StringBuilder sb = new StringBuilder();

    for(String s : words){
        int sumOf = 0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            int ele = (int) ch - 97;
            sumOf += weights[ele];            
        }
        int ans = sumOf % 26;
        
        sb.append((char) ('z' - ans));
    }

    return sb.toString();
    }
}