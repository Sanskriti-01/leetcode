class Solution {
    public int maximumDifference(int[] nums) {
       int min=nums[0];
       int ans=-1;
       for(int i=0;i<nums.length;i++){
        if(nums[i]>min){
            ans=Math.max(ans,nums[i]-min);
        }
        min=Math.min(nums[i],min);

       }
       return ans;
    }
}