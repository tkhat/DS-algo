package heightChecker;

public class Test {
    public static void main(String[] args) {
        HeightChecker checker = new HeightChecker();
        int[] arr = new int[]{1,1,4,2,1,3};

        int[] sorted = checker.sorter(arr);

        for (int i =0; i < sorted.length; i++){
            System.out.print(sorted[i] + ", ");
        }
        System.out.println();
        for (int i =0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}
