class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int left=0;
        int right=0;
        int ans=0;
        int count=0;
        int len=0;
        int get=0;
        while(right<nums.length){
            get=hm.getOrDefault(nums[right],0);
            hm.put(nums[right],get+1);
            len++;
            if(hm.get(nums[right])==k+1){
                count=nums[right];
                while(left<nums.length&&nums[left]!=count){
                get=hm.getOrDefault(nums[left],0);
                hm.put(nums[left],get-1);
                left++;
                len--;
            }
            if(left<nums.length&&nums[left]==count){
            get=hm.getOrDefault(nums[left],0);
            hm.put(nums[left],get-1);
            left++;
            len--;
            }
            }
            
            right++;
            ans=Math.max(ans,len);

        }
        return ans;
    }
}