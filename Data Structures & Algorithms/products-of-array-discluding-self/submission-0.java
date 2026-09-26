class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ret = new int[nums.length];
        int pref = 1;
        for(int i=0; i<nums.length; i++){
            ret[i] = pref;
            pref *= nums[i];
        }
        int suffix = 1;
        for(int k=nums.length - 1; k>=0; k--){
            ret[k] *= suffix;
            suffix *= nums[k];
        }
        return ret;
       
    }
}
    

