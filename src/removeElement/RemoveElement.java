package removeElement;

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int last = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                if (nums[last] != val){

                }
                nums[i] = nums[last];
                last--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println("steps: " + last);
        return nums.length - last;
    }
}