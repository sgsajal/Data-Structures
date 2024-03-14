class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans=0;
        int left=0;
        int sum=0;
        while(left<nums.length){
            int right=left+1;
            sum=nums[left];
            if(sum==goal) ans+=1;
            while(right<nums.length){
                if(sum>goal) break;
                sum+=nums[right];
                if(sum==goal) ans+=1;
                // if(sum==goal) System.out.print(left+" "+right);
                right++;
            }
            // sum-=nums[left];
            left++;
        }
        return ans;
    }
}