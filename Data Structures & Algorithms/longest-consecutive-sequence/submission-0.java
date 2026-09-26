class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length==0){
            return 0;
        }
        int max = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length;i++){
        set.add(nums[i]);
        }
        
        for(int head : set){
        if(set.contains(head + 1) && !set.contains(head-1)){
            int maxseq=1;
        while(set.contains(head+1)){
            ++maxseq;
            ++head;
        }
        if(maxseq >= max)
        max = maxseq;
        }
        }
        return max;
        }
        
        
    }

