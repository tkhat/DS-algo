package twoDArrDiagonalTraversal;


public class Test {
    public static void main(String[] args) {

        int[][] mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Solution ss = new Solution();
        int[] res = ss.findDiagonalOrder(mat);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

}
