class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maxCandies = 0;
        ArrayList<Boolean> ans = new ArrayList<>();

        for(int val : candies){
            maxCandies = Math.max(maxCandies,val);
        }

        for(int i=0;i<candies.length;i++){
            int totalCandies = candies[i] + extraCandies;

            if(totalCandies >= maxCandies){
                ans.add(i,true);
            }
            else{
                ans.add(i,false);
            }
        }

        return ans;

    }
}