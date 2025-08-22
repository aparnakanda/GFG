class Solution {
    public boolean isPalinSent(String s) {
        // code here
        if(s ==null){
            return false;
        }
        String str=s.toUpperCase();
        StringBuilder st=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                st.append(ch);
            }
        }
        int left=0;
        int right=st.length()-1;
        while(left<right){
            if(st.charAt(left)!=st.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}