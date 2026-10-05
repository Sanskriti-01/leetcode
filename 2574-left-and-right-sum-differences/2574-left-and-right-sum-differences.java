import java.util.*;
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sl=0;
            int sr=0;
            for(int j=0;j<i;j++){
                sl+=nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                sr+=nums[j];
            }
            ans[i]=Math.abs(sr-sl);
        }
        return ans;
    }
}