class Solution {

    // public int recurSoln(int index,int target,int[] nums,int product){
    //     if(index==nums.size()||nums[i]*product>target){
    //         return 0;
    //     }
    //     int takeProd=1+recurSoln(index+1,target,nums,nums[index]*product);
        
    // }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
         int sum = 1;
        int result = 0;
        int left = 0;

        for(int right = 0; right < nums.length; right++) {

            sum *= nums[right];

            while(sum >= k && left <= right) {
                sum /= nums[left];
                left++;
            }

            result += right - left + 1;
        }

        return result;
    }
}