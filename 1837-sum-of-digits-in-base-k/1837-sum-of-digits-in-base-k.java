class Solution {
    public int sumBase(int n, int k) {
        
        int sum=0;
        while(n!=0){
            int ld=n%k;
            sum+=ld;
            n=n/k;
        }
        return sum;
    }
}