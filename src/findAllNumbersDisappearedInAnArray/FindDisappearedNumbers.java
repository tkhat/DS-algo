package findAllNumbersDisappearedInAnArray;

import java.util.*;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            disappearedNumbers.add(null);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] <= nums.length) {

                disappearedNumbers.set((nums[i] - 1), nums[i]);

            }
        }
        for (int i = disappearedNumbers.size() - 1; i >= 0; i--) {
            if (disappearedNumbers.get(i) != null) {
                disappearedNumbers.remove(i);
            } else {
                disappearedNumbers.set(i,(i+1));
            }
        }
        return disappearedNumbers;
    }
}
