class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        int ans=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].length()==0){
                i--;
            }
            else{
                return arr[i].length();
            }
        }
        return 0;
    }
}