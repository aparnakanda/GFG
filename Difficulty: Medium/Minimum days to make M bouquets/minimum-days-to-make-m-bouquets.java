class Solution {
    public int minDaysBloom(int[] arr, int k, int m) {
        // code here
        int n=arr.length;
        if(n<(k*m)){
            return -1;
        }
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int num:arr){
            low=Math.min(low,num);
            high=Math.max(high,num);
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(feasible(arr,m,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    private boolean feasible(int[] arr,int m, int k, int day){
        int boq=0;
        int cons=0;
        for(int num:arr){
            if(num<=day){
                cons++;
                if(cons==k){
                    boq++;
                    if(boq>=m){
                        return true;
                    }
                    cons=0;
                }
            }
            else{
                cons=0;
            }
        }
        return boq>=m;
    }
}