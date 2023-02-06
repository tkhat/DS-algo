package sorting.insertion;

public class InsertionSortExample {

    public int[] sortArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            while (j >= 0 && nums[j + 1] < nums[j]) {
                int tmp = nums[j + 1];
                nums[j + 1] = nums[j];
                nums[j] = tmp;
                j--;
            }
        }
        return nums;
    }

}
