// User function Template for Java

class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        int[] temp=new int[N*N];
        int k=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                temp[k]=Mat[i][j];
                k++;
            }
        }
        Arrays.sort(temp);
        k=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                Mat[i][j]=temp[k];
                k++;
            }
        }
        return Mat;
        
    }
};