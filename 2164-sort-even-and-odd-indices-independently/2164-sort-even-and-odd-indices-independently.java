import java.util.*;

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        int[] even = new int[(n + 1) / 2];
        int[] odd = new int[n / 2];

        int e = 0, o = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even[e++] = nums[i];
            } else {
                odd[o++] = nums[i];
            }
        }

        Arrays.sort(even);
        Arrays.sort(odd);

        int j = 0;
        for (int i = 0; i < even.length; i++) {
            nums[j] = even[i];
            j += 2;
        }

        j = 1;
        for (int i = odd.length - 1; i >= 0; i--) {
            nums[j] = odd[i];
            j += 2;
        }

        return nums;
    }
}