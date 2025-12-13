class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
    
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=left;i<=right;i++){
            if(isSelfDividing(i)){
                ans.add(i);
            }
        }

        return ans;
    }

    static boolean isSelfDividing(int num){
        int temp = num;
        
        while(num > 0){
            int ld = num % 10;

            if(ld == 0 || temp % ld != 0){
                return false;
            }
            
            num /= 10;
            
            
        }
        return true;
    }
}