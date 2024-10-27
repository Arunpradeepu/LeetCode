class Solution {
    public static class Totaldays{
        public static int func(int[] weights,int mid){
            int totdays=1;
            int load=0;
            int n=weights.length;
            for(int i=0;i<n;i++){
                if(load+weights[i]>mid){
                    totdays+=1;
                    load=weights[i];

                }
                else{
                    load=load+weights[i];
                }
            }
            return totdays;
        }
       
    }





    public int shipWithinDays(int[] weights, int days) {
        int l=Arrays.stream(weights).max().getAsInt();
        int r=Arrays.stream(weights).sum();
        while(l<=r){
            int mid=(l+r)/2;
            int totdays=Totaldays.func(weights,mid);
            if(totdays<=days){
                r=mid-1;

            }
            else {
                l=mid+1;

            }
            

        }
        return l;
    }
}