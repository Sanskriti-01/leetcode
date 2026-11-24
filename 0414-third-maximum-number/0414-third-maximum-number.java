class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
       for(int i=0 ; i<nums.length/2 ; i++){
        int temp=nums[i];
        nums[i]=nums[nums.length-1-i];
         nums[nums.length-1-i]=temp;
       }
       int count=1;
       for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
            count++;
        }
        if(count==3)
        return nums[i];
       }
            
       return nums[0];
    }
}