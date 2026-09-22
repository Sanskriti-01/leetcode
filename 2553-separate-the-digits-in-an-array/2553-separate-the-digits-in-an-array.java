class Solution {
    public int[] separateDigits(int[] nums){
       ArrayList<Integer> ans=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        String str=String.valueOf(nums[i]);
        for(int j=0;j<str.length();j++){
            ans.add(str.charAt(j)-'0');
        }
    }
        int[] result=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }

       
       return result; 
    }
}