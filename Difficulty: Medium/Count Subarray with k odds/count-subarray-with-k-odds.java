class Solution {
    public int countSubarrays(int[] arr, int k) {
        // code here
        int ans=0, oddCount=0;
        Map<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        for(int num:arr){
            if(num%2!=0){
                oddCount++;
            }
            ans+=mp.getOrDefault(oddCount-k,0);
            mp.put(oddCount,mp.getOrDefault(oddCount,0)+1);
        }
        return ans;
    }
}
