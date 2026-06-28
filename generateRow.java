class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int ans = 1;

        for(int i=1;i<=numRows;i++){
            ArrayList<Integer> temp = generateRow(i);
            list.add(temp);
        }

        return list;
    }
    public ArrayList<Integer> generateRow(int numRows){

        ArrayList<Integer> row = new ArrayList<>();
        row.add(1);
        int ans = 1;

        for(int i=1;i<numRows;i++){
            ans = ans * (numRows-i);
            ans = ans / i;

            row.add(ans);
        }

        return row;
    }
}