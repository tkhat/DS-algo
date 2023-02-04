package spiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int x = 0;
        int y = 0;
        int index = 0;
        int count = matrix[0].length * matrix.length;
        int upBorder = 0;
        int downBorder = matrix.length-1;
        int frontBorder = matrix[0].length-1;
        int backBorder = 0;
        boolean isUpOrFront = true;
        while (index < count) {
            result.add(matrix[x][y]);
            if (isUpOrFront) {
                if (x > upBorder) {
                    x -= 1;
                } else if (y < frontBorder) {
                    y += 1;
                } else {
                    x += 1;
                    upBorder++;
                    frontBorder--;
                    isUpOrFront = false;
                }
            } else {
                if (x < downBorder) {
                    x += 1;
                } else if (y > backBorder) {
                    y -= 1;
                } else {
                    x-=1;
                    downBorder--;
                    backBorder++;
                    isUpOrFront = true;
                }
            }
            index++;
        }
        return result;
    }
}
