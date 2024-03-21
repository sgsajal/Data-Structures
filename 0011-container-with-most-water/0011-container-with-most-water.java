class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int water=0;
        int maxWater=0;
        while(left<right){
            water=(right-left)*Math.min(height[left],height[right]);
            if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }

            if(water>maxWater){
                maxWater=water;
            }
        }
        return maxWater;
    }
}