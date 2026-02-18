class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if(arr.length == 1){
            return 1;
        }

        int diff = 0;
        int cnt = 1;
        int ans = 1;
        for(int i = 0;i<arr.length-1;i++){
            int temp = arr[i] - arr[i+1];

            if((diff > 0 && temp <0) || (diff < 0 && temp > 0)){
                cnt++;
            }

            else if(temp == 0){
                cnt = 1;
            }

            else{
                cnt = 2;
            }

            diff = temp;

            ans = Math.max(cnt,ans);
        }

        return ans;
        
    }
}