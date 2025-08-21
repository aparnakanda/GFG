class Solution {
    public int maxMinDiff(int[] arr, int k) {
        // code here
         Arrays.sort(arr);
        int low = 0, high = arr[arr.length - 1] - arr[0];

        while (low < high) {
            int mid = low + (high - low + 1) / 2;
            if (canPlace(arr, k, mid)) {
                low = mid;  
            } else {
                high = mid - 1; 
            }
        }
        return low;
    }

    private static boolean canPlace(int[] arr, int k, int gap) {
        int count = 1;            
        int last = arr[0];
        for (int i = 1; i < arr.length && count < k; i++) {
            if (arr[i] - last >= gap) {
                count++;
                last = arr[i];
            }
        }
        return count >= k;

    }
}
