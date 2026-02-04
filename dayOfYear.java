class Solution {
    public int dayOfYear(String date) {
        int[] arr = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        int year = Integer.parseInt(date.substring(0,4));

        int month = ((date.charAt(5)- '0')*10) + (date.charAt(6)- '0');

        int day = ((date.charAt(8)- '0')*10) + (date.charAt(9)- '0');
        
        if(isLeap(year)){
            arr[2] = 29;
        }

        int ans = 0;
        for(int i=0;i<month;i++){
            ans += arr[i];
        }

        

        return (ans+day);

    }

    public boolean isLeap(int year){
        if((year % 400 ==0) || (year % 4==0 && (year % 100!= 0))){
            return true;
        }
        return false;
    }



}