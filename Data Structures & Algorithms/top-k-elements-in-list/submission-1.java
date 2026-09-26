class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            heap.add(new int[]{key, value});
            if(heap.size() > k){
                heap.poll();
            }
        }
        int[] result = new int[k];
        for(int n = 0; n<k; n++){
            result[n] = heap.poll()[0];
        }
        return result;
    }
}
