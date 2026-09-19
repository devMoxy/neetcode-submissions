class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int low = 0;
        int high = numbers.length - 1;
         
        while(true){
            int cal = numbers[low] + numbers[high];
            if(cal == target){
                arr[0] = low + 1;
                arr[1] = high + 1;
                break;
            }
            if(cal > target){
                high--;  
            }else{
                low++;
            }
        }
        return arr;
    }
}