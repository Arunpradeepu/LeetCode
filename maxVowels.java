class Solution {
    public int maxVowels(String s, int k) {
        int i = 0;
        int vov = 0;
        int ans = 0;

        for(int j = 0;j<s.length();j++){
            char ch = s.charAt(j);

            while(j - i + 1 > k){
                if("aeiouAEIOU".indexOf(s.charAt(i)) != -1){
                    vov--;
                }
                i++;

            }

            if("aeiouAEIOU".indexOf(ch) != -1){
                vov++;
            }

            ans = Math.max(ans,vov);

        }

        return ans;
        
    }
}