class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list =  new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if((i > 0) && (nums[i] == nums[i - 1])){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            int comp = -(nums[i]);

            while(left < right){
                if(nums[right] + nums[left] == comp){
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums[i]);
                    subList.add(nums[left]);
                    subList.add(nums[right]);
                    list.add(subList);

                    left++;
                    right--;

                    while((left < right) && nums[left] == nums[left - 1]){
                        left++;
                    }

                    while((left < right) && nums[right] == nums[right + 1]){
                        right--;
                    }
                }else if(nums[right] + nums[left] > comp){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return list;
    }
}
