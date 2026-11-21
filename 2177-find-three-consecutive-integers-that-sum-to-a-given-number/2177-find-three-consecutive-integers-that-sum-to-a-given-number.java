class Solution {
    public long[] sumOfThree(long num) {
        if(num%3!=0) 
        return new long[]{};
        if(num==0) return new long[]{-1,0,1};
        long x=(num/3)-1;
        if(x>=0){
            return new long[]{x,x+1,x+2};
        }
        return new long[]{};
    }     
}