class Solution {
    public int jump(int[] nums) {
        if(nums.length==1) return 0;
        if(nums.length<=nums[0]) return 1;
        
        int pos=nums[0];
        int count=1;
        int jump=nums[0];
        for(int i=1;i<nums.length-1;i++){
            jump--;
            if(--pos<nums[i]){
                pos=nums[i];
            }
            if(jump==0){
                jump=pos;
                count++;
            }
        }
        return count;
    }
}