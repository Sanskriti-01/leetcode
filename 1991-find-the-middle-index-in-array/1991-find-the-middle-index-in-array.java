class Solution {
    public int findMiddleIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int b=0;
            int a=0;
            for(int j=0;j<i;j++){
                b+=nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                a+=nums[j];
            }
            if(a==b)
              return i;
        }
        return -1;
    }
}