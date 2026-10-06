class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        for(int num:nums){
            set.add(num);
        }
        int ans=-1;
        for(int num:nums){
            if(num>0&&set.contains(-num))
            ans=Math.max(ans,num);
        }
        return ans;
    }
}