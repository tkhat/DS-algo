package spiralMatrix;

import java.util.List;

public class TestSpiralOrder {
    public static void main(String[] args) {

        SpiralOrder spiralOrder = new SpiralOrder();
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat = new int[][]{{1, 2, 3,4}, { 5, 6,7,8}, {9,10,11,12}};
        List<Integer> res = spiralOrder.spiralOrder(mat);

        for (int i =0; i < res.size(); i++){
            System.out.println(res.get(i));
        }
    }
}
