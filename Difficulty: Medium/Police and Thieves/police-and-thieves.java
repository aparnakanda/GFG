class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
          List<Integer> police = new ArrayList<>();
        List<Integer> thief = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'P') police.add(i);
            else thief.add(i);
        }

        int i = 0, j = 0, count = 0;

        while (i < police.size() && j < thief.size()) {
            int p = police.get(i);
            int t = thief.get(j);

            if (Math.abs(p - t) <= k) {
                count++;
                i++;
                j++;
            } else if (p < t) {
                i++;
            } else {
                j++;
            }
        }

        return count;
    }
}