class Solution {
    public int trap(int[] height) {
        int left =0;
        int right = height.length-1;
        int leftmax=height[0];
        int rightmax=height[right];
        int volume =0;
        while(left < right){
            if(height[right] < height[left]){
                rightmax = Math.max(rightmax,height[right]);
                volume = volume + (rightmax -height[right]);
                right--;
            }else{
                leftmax = Math.max(leftmax,height[left]);
                volume = volume + (leftmax -height[left]);
                left++;
            }
        }
        return volume;
    }
}
