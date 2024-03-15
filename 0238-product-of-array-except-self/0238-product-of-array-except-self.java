class Solution {
    public int[] productExceptSelf(int[] nums) {
     boolean flag=false;
     int prod=1;
     for(int i=0;i<nums.length;i++){
        if(!flag&&nums[i]==0){
            flag=true;
        }
        else{
            prod*=nums[i];
        }
     }
     int[] ans=new int[nums.length];
     for(int i=0;i<nums.length;i++){
        if(flag&&nums[i]==0){ans[i]=prod;}
        else if (flag) ans[i]=0;
        else ans[i] =prod/nums[i];
     }  
     return ans; 
    }
}