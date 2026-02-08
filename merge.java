class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int ind = nums1.length-1;

        if(n == 0){
            return;
        }



        while(j >= 0 && i >= 0){
            if(nums1[i] < nums2[j]){
                nums1[ind] = nums2[j];
                ind--;
                j--;
            }
            else{
                nums1[ind] = nums1[i];
                i--;
                ind--;
            }
        }

        if(j >= 0){
            for(int a = j;a>=0;a--){
                nums1[ind] = nums2[a];
                ind--;
            }
        }

        return;
    }
}