package KthLargestElementInAnArray;

import java.util.PriorityQueue;

public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> descendingQueue = new PriorityQueue<>(k);
        for (int i = 0; i < nums.length; i++) {
            if (i < k){
                descendingQueue.offer(nums[i]);
            } else {
                if (nums[i] > descendingQueue.peek()){
                    descendingQueue.poll();
                    descendingQueue.offer(nums[i]);
                }
            }
        }
        return descendingQueue.poll();
    }
}

