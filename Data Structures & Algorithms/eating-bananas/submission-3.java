class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n=piles.length;
        int max=piles[n-1];
        if(h==n){
            return max;
        }
        else{
        int left = 1, right = max;
        int p = max;
        while(left <= right){
            int k = left + (right - left) / 2;
            long s1 = 0;
            for(int j=0;j<n;j++){
                if(piles[j]%k!=0){
                    s1+=((piles[j]/k)+1);
                } else {
                    s1+=piles[j]/k;
                }
            }
            if(s1 > h){
                left = k + 1;
            } else {
                p = k;
                right = k - 1;
            }
        }
        return p;
        }
    }
}