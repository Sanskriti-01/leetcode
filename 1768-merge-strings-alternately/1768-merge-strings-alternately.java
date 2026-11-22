
import java.util.*;

class Solution {
    public String mergeAlternately(String word1, String word2) {

        ArrayList<Character> ans = new ArrayList<>();

        int i = 0;

        while (i < word1.length() || i < word2.length()) {

            if (i < word1.length()) {
                ans.add(word1.charAt(i));
            }

            if (i < word2.length()) {
                ans.add(word2.charAt(i));
            }

            i++;
        }

        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < ans.size(); k++) {
            sb.append(ans.get(k));
        }

        return sb.toString();
    }
}
