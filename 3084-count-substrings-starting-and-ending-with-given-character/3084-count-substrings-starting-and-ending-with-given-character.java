class Solution {
    public long countSubstrings(String s, char c) {
     long count=0;
        long num=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count+=num;
                num++;
            }
            // System.out.println(count);
        }
        return count;
    }
}