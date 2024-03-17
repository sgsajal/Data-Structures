class Solution {
    public boolean isSubstringPresent(String s) {
        // boolean ans=false;
        for(int i=0;i<s.length()-1;i++){
            String sub=s.substring(i,i+2);
            String rev="";
            rev+=sub.charAt(1);
            rev+=sub.charAt(0);
            if(s.indexOf(rev)!=-1) return true;
        }
        return false;
    }
}