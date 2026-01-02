class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        int rows=mat.length;
        int cols=mat[0].length;
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int i=0;i<cols;i++){
           res.add(new ArrayList<>());
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                res.get(j).add(mat[i][j]);
            }
        }
        return res;
    }
}