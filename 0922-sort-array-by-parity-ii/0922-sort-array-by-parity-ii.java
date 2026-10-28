class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
            even.add(nums[i]);
            else
            odd.add(nums[i]);
        }
        int e=0,o=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0)
            ans[i]=even.get(e++);
            else
            ans[i]=odd.get(o++);
        }
        return ans;
    }
}