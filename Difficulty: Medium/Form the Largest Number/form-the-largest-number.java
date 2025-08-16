class Solution {
    public String findLargest(int[] arr) {
        // code here
        String[] arr1=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=String.valueOf(arr[i]);
        }
        Arrays.sort(arr1,(a,b)->(b+a).compareTo(a+b));
        if(arr1[0].equals("0")) return "0";
        StringBuilder res=new StringBuilder();
        for(String s:arr1){
            res.append(s);
        }
        return res.toString();
        
    }
}