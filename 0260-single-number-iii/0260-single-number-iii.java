class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] ans=new int[2];
        int index=0;
        for(int key:map.keySet()){
            if(map.get(key)==1){
            ans[index]=key;
            index++;
            }
        }
        return ans;
    }
}