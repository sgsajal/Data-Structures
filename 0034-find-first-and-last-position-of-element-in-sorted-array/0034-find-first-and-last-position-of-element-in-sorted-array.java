class Solution {

    static int binarySearchLeft(int[] nums,int target,int left,int right){
        if(right-left==1){
            if(nums[left]==target){
                return left;
            }
            return right;
        }
        int mid=left+(right-left)/2;
        // System.out.println(mid);
        if(nums[mid]>=target){
            return binarySearchLeft(nums,target,left,mid);
        }
        return binarySearchLeft(nums,target,mid,right);
    }
    static int binarySearchRight(int[] nums,int target,int left,int right){
        if(right-left==1){
            if(nums[right]==target){
                return right;
            }
            return left;
        }
        int mid=left+(right-left)/2;
        System.out.println(mid);
        if(nums[mid]<=target){
            return binarySearchRight(nums,target,mid,right);
        }
        return binarySearchRight(nums,target,left,mid);
    }


    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0||(nums.length==1&&nums[0]!=target)) return new int[] {-1,-1};
        if(nums.length==1&&nums[0]==target) return new int[] {0,0};
        int pos1=binarySearchLeft(nums,target,0,nums.length-1);
        if(nums[pos1]!=target){
            pos1=-1;
        }
        int pos2=binarySearchRight(nums,target,0,nums.length-1);
        if(nums[pos2]!=target){
            pos2=pos1;
        }
        return new int[] {pos1 , pos2};
    }
}