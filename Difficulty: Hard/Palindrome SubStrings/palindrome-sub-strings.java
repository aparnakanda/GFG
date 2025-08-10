class Solution {
    public int countPS(String s) {
        // code here
        int n=s.length();
        int count=0;
        for(int cent=0;cent<n;cent++){
            int left=cent;
            int right=cent;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                if((right-left)+1>=2){
                    count++;
                }
                left--;
                right++;
            }
        }
        for(int cent=0;cent<n-1;cent++){
            int left=cent;
            int right=cent+1;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                  if((right-left)+1>=2){
                    count++;
                }
                left--;
                right++;
            }
        }
        return count;
    }
}