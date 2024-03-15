class Solution {
    public int lengthOfLongestSubstring(String s) {
    String arr="";
    int count=0;
    int ansCount=0;
    for(int i=0;i<s.length();i++){
        char m=s.charAt(i);
        if(arr.indexOf(m)==-1){
            arr+=m;
        }
        else{
            // count=arr.size();
            arr=arr.substring(arr.indexOf(m)+1);
            arr+=m;
        }
        count=arr.length();
        if(count>ansCount){
            ansCount=count;
        }
    }
            return ansCount;   
    }
}