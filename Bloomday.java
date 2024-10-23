class Solution {
    public static class NoOfB{
        public static boolean func(int m,int[] bloomDay,int k,int mid){
            int count=0;
            int bouquets=0;

            int n=bloomDay.length;
            for(int i=0;i<n;i++){
                if(bloomDay[i]<=mid){
                    count+=1;
                }
                else{
                    bouquets+=count/k;
                    count=0;
                }

            }
            bouquets+=count/k;
            return bouquets>=m;



        }
    }
    public int minDays(int[] bloomDay, int m, int k) {
        
        int l=Arrays.stream(bloomDay).min().getAsInt();
        int r=Arrays.stream(bloomDay).max().getAsInt();
        int ans=r;
        int n=bloomDay.length;
        long minFlowerNeeded= (long) m*k;
        if(n < minFlowerNeeded){
            return -1;
        }
        while(l<=r){
            int mid=(l+r)/2;
            boolean flower=NoOfB.func(m,bloomDay,k,mid);
            if(flower){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }


        }
        return ans;
    }
}