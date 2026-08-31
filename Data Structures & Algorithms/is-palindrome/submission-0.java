class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        int l=0;
        int r=s.length()-1;
        boolean t=true;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                t=false;
                break;
            }
            else{
                l++;
                r--;
            }
        }
        return t;
    }
}
