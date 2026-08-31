class Solution {
    public int[] twoSum(int[] nums, int target) {
        int s=0;
        int n=nums.length;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++){
        int d=target-nums[i];
        if(map.containsKey(d)){
            return new int[]{map.get(d),i};
        }
        map.put(nums[i],i);
       }
        return new int[]{};
    }
}
