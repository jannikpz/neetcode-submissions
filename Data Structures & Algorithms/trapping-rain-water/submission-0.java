class Solution {
    public int trap(int[] nums) {
        int n = nums.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int volume =0;

        leftMax[0] = nums[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], nums[i]);
        }

        rightMax[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
        }
        for(int i=0; i<n;i++){
            volume = volume + (Math.min(rightMax[i],leftMax[i]) - nums[i]);
        }
        return volume;
    
}
}
