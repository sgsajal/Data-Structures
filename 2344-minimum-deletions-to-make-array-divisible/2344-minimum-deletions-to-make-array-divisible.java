class Solution {


    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }


    public int minOperations(int[] nums, int[] numsDivide) {
     Arrays.sort(nums);
    //  int number=nums[0];
    //  int count=0;
    //  boolean flag=false;
    //  while(!flag&&count<nums.length){
    //     number=nums[count];
    //     for(int i=0;i<numsDivide.length;i++){
    //         if(numsDivide[i]%number!=0) {
    //         flag=false;
    //         break;
    //         }
    //         flag=true;
    //     }
    //     count++;
    //     if(count==nums.length){
    //              break;
    //     }
    //     while(!flag && nums[count]==number){
    //         count++;
    //         if(count==nums.length){
    //              break;
    //         }
    //     }
    //  }
    //     if(!flag) return -1;
    //     return count-1;
    // }

    int gcdVal=numsDivide[0];
    for(int i=1;i<numsDivide.length;i++){
        gcdVal=gcd(gcdVal,numsDivide[i]);
    }
    for(int i=0;i<nums.length;i++){
        if(gcdVal%nums[i]==0) return i;
    }
    return -1;
    }
}