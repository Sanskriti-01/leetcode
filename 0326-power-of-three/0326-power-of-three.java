class Solution {
    public boolean isPowerOfThree(int n) {
      
        int ans = 1;

        for(int i = 0; i <= 19; i++) {
            if(ans == n) {
                return true;
            }

            ans = ans * 3;
        }

        return false;
    } 
}