class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] res=new int[n];
        for(int l=0;l<n;l++){
            for(int i=l+1;i<n;i++){
                if(temperatures[l]<temperatures[i]){
                    res[l]=i-l;
                    break;
                }
            }
        }
        return res;
    }
}
