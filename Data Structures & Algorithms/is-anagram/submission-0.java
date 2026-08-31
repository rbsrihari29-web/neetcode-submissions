class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        int n=s.length();
        int[] s1=new int[n];
        int[] s2=new int[n];
        for(int i=0;i<n;i++){
            s1[i]=s.charAt(i)-'a';
            s2[i]=t.charAt(i)-'a';
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1,s2)){
            return true;
        }
        else{
            return false;
        }
    }
}
