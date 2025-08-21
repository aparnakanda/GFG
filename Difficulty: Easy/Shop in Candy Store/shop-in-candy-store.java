class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int n=prices.length;
        int m=n;
        Arrays.sort(prices);
        int min=0;
        int max=0; 
        for(int i=0;i<prices.length;i++){
           min=min+prices[i];
           max=max+prices[m-1];
           n=n-k-1;
           m--;
           if(n<=0){
               break;
           }
        }
        res.add(min);
        res.add(max);
        return res;
    }
}
