class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            char t=s.charAt(i);
            int j;
            for(j=i+1;j<s.length();j++){
                if(t==s.charAt(j))
                break;
            }
        
      if(j==s.length()&&i==s.indexOf(t)) return i;
        }
        return -1;
    }
}