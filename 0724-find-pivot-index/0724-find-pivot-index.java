class Solution {
    public int pivotIndex(int[] nums) {
      
       for(int i=0;i<nums.length;i++){
         int sumright=0;
          int sumleft=0;
        for(int j=0;j<i;j++){
            sumleft+=nums[j];
        }
        for(int j=i+1;j<nums.length;j++){
            sumright+=nums[j];
        }
        if(sumright==sumleft){
            return i;
        }
       } 
       return -1;
    }
}