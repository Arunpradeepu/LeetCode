class Solution {
    public boolean lemonadeChange(int[] bills) {
        int dol5 = 0;
        int dol10 = 0;

        for(int i=0;i<bills.length;i++){
            if(bills[i] == 5){
                dol5++;
            }
            else if(bills[i] == 10){
                if(dol5 != 0){
                    dol5--;
                    dol10++;
                }
                else{
                    return false;
                }
            }

            else{
                if(dol10 != 0 && dol5 != 0){
                    dol10--;
                    dol5--;
                }

                else if(dol5 >= 3){
                    dol5 = dol5 -3;
                }
                else{
                    return false;
                }
            }
        }

        return true;
    }
}