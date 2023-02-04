package twoSum;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> pair = new HashMap<>();
        int[] indicies = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (pair.containsKey(nums[i])) {
                indicies[0] = pair.get(nums[i]);
                indicies[1] = i;
            } else {
                pair.put(target - nums[i], i);
            }
        }
        return indicies;
    }
}
