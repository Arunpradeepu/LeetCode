class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int j = 0;
        int size = p.length();
        StringBuilder sb = new StringBuilder();
        List<Integer> res = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            sb.append(ch);

            if(i-j+1 == size){
                boolean ans = isAnagranm(sb.toString(),p);
                if(ans){
                    res.add(j);
                }
                sb.deleteCharAt(0);
                j++;
            }
        }

        return res;
        
    }

    public static boolean isAnagranm(String s1,String s2){
        int[] arr = new int[26];
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            int val = ch - 'a';
            arr[val]++;
        }

        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            int val = ch - 'a';
            arr[val]--;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
}