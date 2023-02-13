package mergeSort;

public class MergeSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 2, 4,5,6,7};
        int[] sortedArr = MergeSort.mergeSort(arr, 0, arr.length - 1);

        for (int i =0; i < sortedArr.length; i++){
            System.out.print(sortedArr[i] +", ");
        }
    }
}
