class Solution {
    public String reverseVowels(String s) {
       char[] arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            
            if ("aeiou".indexOf(Character.toLowerCase(arr[i])) == -1) {
                i++;
            }
            else if ("aeiou".indexOf(Character.toLowerCase(arr[j])) == -1) {
                j--;
            }
            else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        return new String(arr);
    }
}

    
