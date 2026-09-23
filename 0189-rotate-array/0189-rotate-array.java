class Solution {
    public int[] rotate(int[] nums, int k) {
        k=k%nums.length;
        int i=0; 

        int j=nums.length-k-1;
     while(i<j){
        int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
     }
     int m=nums.length-k;
     int n=nums.length-1;
     while(m<n){
        int temp = nums[m];
            nums[m] = nums[n];
            nums[n] = temp;

            m++;
            n--;
     }
     int o=0;
     int p=nums.length-1;
     while(o<p){
        int temp = nums[o];
            nums[o] = nums[p];
            nums[p] = temp;

            o++;
            p--;
     }
     return nums;
    }
}