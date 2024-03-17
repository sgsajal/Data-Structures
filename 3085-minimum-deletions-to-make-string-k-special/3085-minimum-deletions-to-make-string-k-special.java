class Solution {
    public int minimumDeletions(String word, int k) {
        int[] count=new int[26];
        for(int i=0;i<word.length();i++){
            count[word.charAt(i)-'a']++;
        }
        Arrays.sort(count);
        int left=0;
        int maxDel=Integer.MAX_VALUE;
        while(count[left]==0) left++;
        for(int i=left;i<26;i++){
            int low=count[i];
            int high=low+k;
            int del=0;
            // System.out.println(count[i]);
            for(int j=left;j<26;j++){ 
                if(count[j]<=high&&count[j]>=low) continue;
                else if(count[j]<low) del+=count[j];
                else del+=count[j]-high;
                // System.out.print(del+" ");
            }
            if(del<maxDel) {
                maxDel=del;
            }
        }
        return maxDel;
    }
}