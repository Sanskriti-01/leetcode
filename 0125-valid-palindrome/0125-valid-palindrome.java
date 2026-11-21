class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
            String rev=new StringBuilder(sb).reverse().toString();
            if(sb.toString().equals(rev.toString())){
                return true;
            
        }
        return false;
    }
}