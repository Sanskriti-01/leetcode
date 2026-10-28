class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
         ArrayList<Integer> neg=new ArrayList<>();
          int[] ans=new int[nums.length];
         for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg.add(nums[i]);
            }
            else{
                pos.add(nums[i]);
            }
         }
         int p=0,n=0;
         for(int i=0;i<nums.length;i++){
            if(i%2==0)
            ans[i]=pos.get(p++);
            else
            ans[i]=neg.get(n++);

         }
         return ans;
    }
}