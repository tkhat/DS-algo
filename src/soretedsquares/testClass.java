package soretedsquares;

public class testClass {

    public static void main(String[] args) {
        int[] sorted = new SortedSquares().sortedSquares(new int[]{-4,-1,0,3,10});

        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
    }
}
