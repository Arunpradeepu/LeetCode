class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int j = 0;
        int adv = 0;
        int ans = 0;
        int base = 0;

        for(int i = 0; i < customers.length;i++){
            
            if(grumpy[i] == 1){
                adv = adv + customers[i];
            }

            if(grumpy[i] == 0){
                base += customers[i];
            }
            

            if(i - j + 1 > minutes){
                if(grumpy[j] == 1){
                    adv = adv - customers[j];
                }
                j++;
            }

            if(i - j + 1 == minutes){
                ans = Math.max(ans,adv);
            }
        }

        return ans + base;
    }
}