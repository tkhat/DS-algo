package soretedsquares;

public class SortedSquares {
    int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        int holder =0;
        int tail = nums.length - 1;
        int head = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[tail] >= nums[head]){
                tail--;
                head++;
            } else {
                holder = nums[tail];
                nums[tail] = nums[head];
                nums[head] = holder;
                tail--;
            }
        }
        return nums;
    }

}

