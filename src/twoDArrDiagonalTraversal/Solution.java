package twoDArrDiagonalTraversal;

public class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int counts = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                counts++;
            }
        }
        int[] result = new int[counts];
        boolean isUp = true;
        int index = 0;
        int x = 0;
        int y = 0;
        while (index < counts) {
            result[index] = mat[x][y];
            if (isUp) {
                if (canGoDiagonalUp(x, y, mat)) {
                    x -= 1;
                    y += 1;
                } else {
                    if (canGoRight(x, y, mat)) {
                        y+=1;
                    } else {
                        x+=1;
                    }
                    isUp = false;
                }
            } else {
                if (canGoDiagonalDown(x, y, mat)) {
                        x +=1;
                        y-=1;
                } else {
                    if (canGoDown(x, y, mat)) {
                        x+=1;
                    } else {
                        y+=1;
                    }
                    isUp = true;
                }
            }
            index++;
        }
        return result;
    }

    boolean canGoDiagonalUp(int x, int y, int[][] matt) {
        if (x > 0 && matt[x].length - y > 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean canGoRight(int x, int y, int[][] matt) {
        if (matt[x].length - y > 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean canGoDiagonalDown(int x, int y, int[][] matt) {
        if (matt.length - x > 1 && y > 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean canGoDown(int x, int y, int[][] matt) {
        if (matt.length - x > 1) {
            return true;
        } else {
            return false;
        }
    }
}