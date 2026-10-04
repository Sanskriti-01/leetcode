class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                ans=ans^nums[i];
            }
            else{
                set.add(nums[i]);
            }
        }

        return ans;
    }
}