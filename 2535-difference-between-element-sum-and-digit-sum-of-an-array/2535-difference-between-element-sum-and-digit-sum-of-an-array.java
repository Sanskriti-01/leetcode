import java.util.*;
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int num=0;
        int sum2=0;
      for(int i=0;i<nums.length;i++){
        sum+=nums[i];
      
        
      int temp=nums[i];
      while(temp>0){
        int ld=temp%10;
        sum2=sum2+ld;
        temp=temp/10;
      
     }
    }
      return sum-sum2;
    }   
}