class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int cnt_max = 0;
        int ind = 0;
      
        
        
        for(int i=0;i<mat.length;i++){
            int cnt = 0;
            for(int value : mat[i]){
                if(value == 1){
                    cnt++;
                }
            }
            if(cnt > cnt_max){
                cnt_max = cnt;
                ind = i;
            }
        }
        
        return new int[]{ind,cnt_max};
    }
}

    