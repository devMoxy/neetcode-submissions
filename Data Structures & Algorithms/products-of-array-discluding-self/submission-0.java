class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int[] left = new int[nums.length];
        int[] rigth = new int[nums.length];
        int result = 1;
        for(int i = 0; i < nums.length; i++){
            left[i] = result;
            result *= nums[i];
        }

        result = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            rigth[i] = result;
            result *= nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            result = left[i] * rigth[i];
            arr[i] = result;
        }
        return arr;
    }
}  
