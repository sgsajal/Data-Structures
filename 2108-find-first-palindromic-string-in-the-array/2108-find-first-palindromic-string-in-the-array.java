class Solution {

    public boolean isPalindrome(String a){
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=a.charAt(a.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }
}