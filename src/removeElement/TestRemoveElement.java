package removeElement;

public class TestRemoveElement {
    public static void main(String[] args) {
        RemoveElement rr = new RemoveElement();
        int[] nums = new int[]{3, 2, 2, 3};
        int[] nums2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        rr.removeElement(nums2, val);
    }
}
