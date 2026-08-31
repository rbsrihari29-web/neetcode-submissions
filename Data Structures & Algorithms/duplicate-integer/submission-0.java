class Solution {
    public boolean hasDuplicate(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    k=1;
                    break;
                }
            }
        }
        if(k==1){
            return true;
        }
        else{
            return false;
        }
    }
}