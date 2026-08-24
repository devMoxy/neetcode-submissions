class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        int[] arr = new int[k];
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.add(new int[]{entry.getKey(), entry.getValue()});
        }
        for(int i = 0; i < k; i++){
            int[] pair = maxHeap.poll();
            arr[i] = pair[0];
        }
        return arr;
    }
}
