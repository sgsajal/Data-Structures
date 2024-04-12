class Solution {
public:
    int trap(vector<int>& height) {
        int maxInd = -1;
        int maxAmt = -1;
        for (int i = 0; i < height.size(); i++) {
            if (maxAmt < height[i]) {
                maxAmt = height[i];
                maxInd = i;
            }
        }
        int l = 0;
        int lMax = 0;
        int ans = 0;
        while (l < maxInd) {
            if (height[l] > lMax) {
                lMax = height[l];
            } else {
                ans += lMax - height[l];
            }
            l++;
        }
        
        int r = height.size() - 1;
        int rMax = 0;
        while (r > maxInd) {
            if (height[r] > rMax) {
                rMax = height[r];
            } else {
                ans += rMax - height[r];
            }
            r--;
        }    
        return ans;
    }
};
