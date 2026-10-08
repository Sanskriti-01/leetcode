class Solution {
    public int mostFrequentEven(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
          }
        }
        int max=0;
        int ans=-1;
        for(int key:map.keySet()){
            if(map.get(key)>max||(map.get(key)==max&&key<ans)){
            max=map.get(key);
            ans=key;
            }
        }
       return ans;
    }
}