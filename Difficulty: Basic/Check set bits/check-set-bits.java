// User function Template for Java
class Solution {
    static int isBitSet(int N) {
        // code here
        return (N>0 && (N&(N+1))==0)?1:0;
    }
}