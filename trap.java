class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int ans = 0;
        int lm = 0;
        int rm = 0;

        while(l!=r){
            if(height[l] < height[r]){
                if(lm < height[l]){
                    lm = height[l];
                }
                ans = ans + lm - height[l];
                l++;
            }
            else{
                if(rm < height[r]){
                    rm = height[r];
                }
                ans = ans + rm - height[r];
                r--;
            }
        }
        return ans;
    }
}