class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       ArrayList<Integer>ans=new ArrayList<>();
   
       int[] visit=new int[nums2.length];
       for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
             if(nums1[i]==nums2[j]&&visit[j]==0){
             ans.add(nums1[i]);
             visit[j]=1;
             break;
             }
        }
       }
        int[] result=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
      return result;
    }
}