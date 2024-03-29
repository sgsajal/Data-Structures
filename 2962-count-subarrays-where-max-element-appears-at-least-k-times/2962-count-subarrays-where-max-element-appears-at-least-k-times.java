class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        long ans=0;
        // for(int i=0;i<=nums.length-k;i++){
        //     int count=0;
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j]==max) count++;

        //         if(count==k){
        //             ans+=nums.length-j;
        //             break;
        //         }
        //     }
        // }
        // return ans;\
        int l = 0;
        int r = 0;
        int n = nums.length;
        
        while (r < n) {
            k -= nums[r] == max ? 1 : 0;
            r++;
            while (k == 0) {
                k += nums[l] == max ? 1 : 0;
                l++;
            }
            ans += l;
        }
        
        return ans;
    }
}