class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int s=0;
        int r=0;
        while(r<n-1){
        for(int i=r+1;i<n;i++){
            int k=prices[i]-prices[r];
            if(k>s){
                s=k;
            }
        }
        r++;
        }
        return s;
        
    }
}
