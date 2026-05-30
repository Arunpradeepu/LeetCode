class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder prefix = new StringBuilder("");

        for(int i=0;i<strs[0].length();i++){
            char ch = strs[0].charAt(i);

            for(int j=0;j<strs.length;j++){

                if(i >= strs[j].length() || ch != strs[j].charAt(i) ){
                    return prefix.toString();
                }

                
            }
            prefix.append(ch);

        }

        return prefix.toString();
    }
}