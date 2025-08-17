class Solution {
    public void rearrange(int[] arr, int x) {
        // code here
        Integer[] boxed=new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            boxed[i]=arr[i];
        }
        Arrays.sort(boxed,(a,b)->{
            int diffA=Math.abs(a-x);
            int diffB=Math.abs(b-x);
            return diffA-diffB;
        });
        for(int i=0;i<arr.length;i++){
            arr[i]=boxed[i];
        }
    }
}
