class Solution {

    public int largestSubSeq(int[] nums,int index,int prevIndex,int[][] dp){
        if(nums.length==index) return 0;
        if(dp[index][prevIndex+1]!=-1){
            return dp[index][prevIndex+1];
        }
        int notTake=largestSubSeq(nums,index+1,prevIndex,dp);
        int take=Integer.MIN_VALUE;
        if(prevIndex==-1||nums[index]>nums[prevIndex]){
            take=1 + largestSubSeq(nums,index+1,index,dp);
        }
        return dp[index][prevIndex+1]=Math.max(take,notTake);
        
    }


    public int lengthOfLIS(int[] nums) {
        int[][] dp=new int[nums.length][nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                dp[i][j]=-1;
            }
        }
        return largestSubSeq(nums,0,-1,dp);


    }
}