class Solution {
    public String addStrings(String num1, String num2) {

        while (num1.length() < num2.length()) {
            num1 = "0" + num1;
        }

        while (num2.length() < num1.length()) {
            num2 = "0" + num2;
        }

        String ans = "";
        int carry = 0;

        for (int i = num1.length() - 1; i >= 0; i--) {

            int a = num1.charAt(i) - '0';
            int b = num2.charAt(i) - '0';

            int sum = a + b + carry;

            ans = (sum % 10) + ans;
            carry = sum / 10;
        }

        if (carry > 0) {
            ans = carry + ans;
        }

        return ans;
    }
}