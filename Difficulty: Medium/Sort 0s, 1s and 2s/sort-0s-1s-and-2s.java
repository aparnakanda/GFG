class Solution {
    public void sort012(int[] arr) {
        // code here
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        int index=0;
        for(int i=0;i<=2;i++){
            int count=mp.getOrDefault(i,0);
            for(int j=0;j<count;j++){
                arr[index]=i;
                index++;
            }
        }
    }
}