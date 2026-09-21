class Solution {
    public boolean isHappy(int n) {
      List<Integer> set=new ArrayList<>();
              while(n != 1) {
                if(set.contains(n)){
                    return false;
                }
                set.add(n);

            int sum = 0;

            while(n > 0) {
                int ld = n % 10;
                sum = sum + (ld * ld);
                n = n / 10;
            }

            n = sum;
        }

        return true;
    }
}