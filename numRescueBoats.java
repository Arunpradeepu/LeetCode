class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length-1;
        int cnt = 0;

        while(i <= j){
            int sum = people[i] + people[j];
            if(i == j){
                cnt++;
                return cnt;
            }
            

            if(sum <= limit){
                cnt++;
                i++;
                j--;
            }
            else{
                j--;
                cnt++;
            }

        }

        return cnt;



    }
}