class Solution {
    public static class Totalhrs{
        public static int func(int[] piles,int mid,int h){
        double hour=0;
        for (int i=0;i<piles.length;i++){
            hour=hour+Math.ceil((double)piles[i]/mid);
        }
        if(hour<=h){
            return 1;
        }
       
        else{
            return 2;
        }
        

    }
}
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high = Arrays.stream(piles).max().getAsInt();
        int ans=high;

        while(low<=high){
            int mid=(low+high)/2;

            int eat=Totalhrs.func(piles,mid,h);

            if(eat==1){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return ans;
    }
}s