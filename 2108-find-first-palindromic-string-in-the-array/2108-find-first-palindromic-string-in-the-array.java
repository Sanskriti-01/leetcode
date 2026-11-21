class Solution {
    public String firstPalindrome(String[] words) {
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].equals(new StringBuilder(words[i]).reverse().toString())){
                ans.add(words[i]);
                break;
            }

        }
        return String.join("",ans);
    }
}