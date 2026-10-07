class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        ArrayList<Double> ans=new ArrayList<>();
        while(i<j){
            double avg=(nums[i]+nums[j])/2.0;
            if(!ans.contains(avg))
            ans.add(avg);
            i++;
            j--;
        }
        return ans.size();
        }
    }
