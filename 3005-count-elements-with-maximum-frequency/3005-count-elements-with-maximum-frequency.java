class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr=new int[100];
        int n=nums.length;
        // for(int i=0;i<100;i++){
        //     arr[i]=0;
        // }
        for(int i=0;i<n;i++){
            arr[nums[i]-1]+=1;
            // System.out.print(arr[nums[i]]);
        }
        Arrays.sort(arr);
        int max=arr[99];
        int ans=0;
        int i=99;
        while(i>=0&&arr[i]==max){
            ans+=max;
            i--;
        }
        return ans;
    }
}