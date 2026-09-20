class Solution {
    public boolean isPowerOfFour(int n) {
        int ans = 1;
        if(n<=0)
        return false;

        for(int i = 0; i <= 19; i++) {
            if(ans == n) {
                return true;
            }

            ans = ans * 4;
        }

        return false;
    }
}