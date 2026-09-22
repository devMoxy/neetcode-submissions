class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && (nums[i] == nums[i - 1])){
                continue;
            }

            int high = nums.length - 1;
            int low = i + 1;
            int target = -(nums[i]);         

            while(low < high){
                int cal = nums[low] + nums[high];
                if(cal == target){
                List<Integer> triplets = new ArrayList<>();
                triplets.add(nums[i]);
                triplets.add(nums[low]);
                triplets.add(nums[high]);
                list.add(triplets);

                low++;
                high--;

                while (low < high && nums[low] == nums[low - 1]) {
                    low++;
                }
                while (low < high && nums[high] == nums[high + 1]) {
                    high--;
                }
            }else if (cal > target) {
                    high--; 
                }else{
                    low++;
                }                
        }
        }
        return list;
    }
}