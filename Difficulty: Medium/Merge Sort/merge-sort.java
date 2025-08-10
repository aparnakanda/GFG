class Solution {
    void divide(int arr[], int low, int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    void merge(int arr[], int low, int mid, int high){
        int left=low;
        int right=mid+1;
        int index=0;
        int[] temp=new int[high-low+1];
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[index++]=arr[left];
                left++;
            }
            else{
                temp[index++]=arr[right];
                right++;
            }
        }
        while(left<=mid){
            temp[index++]=arr[left];
                left++;
        }
        while(right<=high){
            temp[index++]=arr[right];
                right++; 
        }
        
        for(int i=0;i<temp.length;i++){
            arr[low+i]=temp[i];
        }
    }
    void mergeSort(int arr[], int l, int r) {
        // code here
        divide(arr,l,r);
    }
}