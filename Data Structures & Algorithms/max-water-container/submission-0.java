class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxvolume = 0;
        while(left<right){
            if(heights[left] < heights[right]){
                maxvolume = Math.max(maxvolume,heights[left] * (right - left));
                left++;
            }else{
                maxvolume = Math.max(maxvolume,heights[right] * (right - left));
                right--;
            }
            
        }
        return maxvolume;
    }
}
