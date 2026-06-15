class Solution {
    public boolean checkValidString(String s) {
        int range[] = new int[2];
        boolean ans = helper(s,range);

        return ans;
    }

    public boolean helper(String s,int range[]){        

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                range[0]++;
                range[1]++;
            }
            else if(ch == ')'){
                range[0]--;
                range[1]--;
            }
            else{
                range[0]--;
                range[1]++;
            }

            if(range[0] < 0) range[0] = 0;

            if(range[1] < 0) return false;
           
        }

        return range[0] == 0;
    }
}