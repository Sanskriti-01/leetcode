class Solution {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1=strs[0];
        String str2=strs[strs.length-1];
        int value=0;
        while(value<str1.length()){
            if(str1.charAt(value)==str2.charAt(value)){
                value++;
            }
            else{
                break;
            }
        }
        return str1.substring(0,value);
    }
    public static void main(String[] args){
        String strs[]={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}