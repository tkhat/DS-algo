package duplicatezeros;

class Solution {
    public void duplicateZeros(int[] arr) {
        int index = (arr.length - 1);
        int zeroInn = 0;
        int lastZeroIndex = 0;

        for (int i = 0; i <= index; i++) {
            if (arr[i] == 0 && index - zeroInn > i) {
                lastZeroIndex = i;
                zeroInn++;
            }
        }
        while (index >= zeroInn) {
            if (index - zeroInn >= 0) {
                arr[index] = arr[index - zeroInn];
                if (arr[index - zeroInn] == 0 && index - zeroInn <= lastZeroIndex) {
                    if (index - 1 >= 0) {
                        arr[index - 1] = arr[index - zeroInn];
                        index--;
                    }
                    zeroInn--;
                }
            }
            index--;
        }
    }
}