class Solution {
    public int majorityElement(int[] nums) {
        int num=0;
        int number=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==number){
                num++;
            }
            else{
                if(num==0){
                    number=nums[i];
                    num=1;;
                }
                else{
                    num--;
                }
            }
        }
        num=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==number){
                num++;
            }
        }
        return num>nums.length/2?number:-1;



    }
}