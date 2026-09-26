class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        HashMap<Integer, Integer> x = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(x.containsKey(target - nums[i])){
                if(i < x.get(target - nums [i])){
                indices[0] = i;
                indices[1] = x.get(target - nums [i]);
                }else{
                indices[1] = i;
                indices[0] = x.get(target - nums [i]);
                }
            }
            x.put(nums[i], i);
        }
        return indices;
    }
}
