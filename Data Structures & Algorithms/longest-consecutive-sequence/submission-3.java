class Solution {
    public int longestConsecutive(int[] nums) {
        int best = 0;
        Set<Integer> numSet = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            numSet.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++){
            if(!(numSet.contains(nums[i] - 1))){
                int current = nums[i];
                int count = 1;
                while(numSet.contains(current + 1)){
                    current = current + 1;
                    count++;
                }
                
                if(count > best){
                    best = count;
                }
            }
        }
        return best;
    }
}
