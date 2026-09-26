class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> liste = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length -2;i++){
            if (i > 0 && nums[i] == nums[i-1]) {
        continue;   }
        int left =i+1 ;
        int right = nums.length - 1;
            
            while(left<right){
                List<Integer> innereListe = new ArrayList<>();
                int sum = nums[left]+nums[right]+nums[i];
                if(sum == 0 && i != left && i!= right && right != left){
                     innereListe.add(nums[left]);
                     innereListe.add(nums[right]);
                     innereListe.add(nums[i]);
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                                 }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                        }
                     left ++;
                     right--;
                }else if(sum < 0 && i != left && i!= right && right != left){
                    left++;
                }else if(sum > 0 && i != left && i!= right && right != left){
                    right--;
                }
                if(!innereListe.isEmpty()){
                    liste.add(innereListe);
                }
                }
                

            }
            return liste;
        }
        
        }

