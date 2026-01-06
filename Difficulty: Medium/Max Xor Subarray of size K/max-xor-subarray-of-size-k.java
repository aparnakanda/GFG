class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int xor=0;
        for(int i=0;i<k;i++){
            xor^=arr[i];
        }
        int maxXor=xor;
        for(int i=k;i<arr.length;i++){
            xor^=arr[i];
            xor^=arr[i-k];
            maxXor=Math.max(maxXor,xor);
        }
        return maxXor;
        
    }
}
