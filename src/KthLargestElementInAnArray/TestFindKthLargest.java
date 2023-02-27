package KthLargestElementInAnArray;

public class TestFindKthLargest {
    public static void main(String[] args) {
        FindKthLargest findKthLargest = new FindKthLargest();
        int[] nums = new int[]{3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest.findKthLargest(nums, 4));
    }
}
