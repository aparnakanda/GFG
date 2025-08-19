class Solution {
    public ArrayList<Integer> farMin(int[] arr) {
        // Code Here
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>(Collections.nCopies(n,-1));
         int[] suffixMin = new int[n];
        suffixMin[n - 1] = n - 1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[suffixMin[i + 1]]) {
                suffixMin[i] = i;
            } else {
                suffixMin[i] = suffixMin[i + 1];
            }
        }
        for (int i = 0; i < n; i++) {
            int low = i + 1, high = n - 1, ans = -1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[suffixMin[mid]] < arr[i]) {
                    ans = suffixMin[mid]; 
                    low = mid + 1;       
                } else {
                    high = mid - 1;
                }
            }
            res.set(i, ans);
        }

        return res;
    }
}