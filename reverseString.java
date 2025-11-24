class Solution {

  

    static void swap(char[] s,int l,int r){

        if(l>r){
            return ;
        }

        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;

        swap(s,l+1,r-1);
    }

    public void reverseString(char[] s) {        

        swap(s,0,s.length -1);
        
        
    }
}