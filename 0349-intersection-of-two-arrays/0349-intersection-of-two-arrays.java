class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        HashSet<Integer> ans= new HashSet<Integer>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }

        int arr[] = new int[ans.size()]; 
          
        int i=0; 
        
        // iterating over the hashset 
        for(int ele:ans){ 
          arr[i++] = ele; 
        }
        return arr;
    }
}