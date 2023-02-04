package thirdMax;

public class ThirdMax {
    public int thirdMax(int[] nums) {
        int firstMax = 0;
        int secondMax = 0;
        int thirdMax = Integer.MIN_VALUE ;
        boolean findOut = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > firstMax) {
                firstMax = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > secondMax && nums[i] < firstMax) {
                secondMax = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= thirdMax && nums[i] < firstMax && nums[i] < secondMax) {
                findOut = true;
                thirdMax = nums[i];
            }
        }
        if (findOut){
            return thirdMax;
        } else {
            return firstMax;
        }
    }
}
