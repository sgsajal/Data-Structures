class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hMap =new HashMap<>();
        int sum = 0;
        int max = 0;
        hMap.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                sum += 1;
            }
            else{
                sum += -1;
            }
            if(!hMap.containsKey(sum))hMap.put(sum, i);
            else{
                max = Math.max(max,  i - hMap.get(sum));
            }
        }
        return max;
    }
}