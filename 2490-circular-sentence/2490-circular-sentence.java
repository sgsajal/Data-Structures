class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arrOfStr = sentence.split(" ");
        boolean flag=true;
        for(int i=0;i<arrOfStr.length-1;i++){
            if(arrOfStr[i].charAt(arrOfStr[i].length()-1)!=arrOfStr[i+1].charAt(0)) return false;
        }
        if(arrOfStr[arrOfStr.length-1].charAt(arrOfStr[arrOfStr.length-1].length()-1)!=arrOfStr[0].charAt(0)) return false;
        return flag;
    }

}