class Solution {
    public int hIndex(int[] citations) {
        // code here
        Arrays.sort(citations); 
        int n = citations.length;
        int h = 0;

        for (int i = 0; i < n; i++) {
            int possibleH = n - i; 
            if (citations[i] >= possibleH) {
                h = possibleH;
                break;
            }
        }
        return h;
    }
}