import java.util.*;
import java.math.BigInteger;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        String s = "";

        for(int i = 0; i < num.length; i++) {
            s += num[i];
        }

        BigInteger n = new BigInteger(s);
        n = n.add(BigInteger.valueOf(k));

        String result = n.toString();

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < result.length(); i++) {
            ans.add(result.charAt(i) - '0');
        }

        return ans;
    }
}