package validmountianarray;

public class ValidMountianArray {
    public boolean validMountainArray(int[] arr) {
        int mountain = 0;
        if (arr.length < 3){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                if (arr[i] < arr[i + 1]) {
                    mountain = i + 1;
                } else {
                    break;
                }
            }
        }
        for (int j = mountain + 1; j < arr.length; j++) {
            if (arr[j] > arr[j - 1]) {
                return false;
            }
        }
        return true;
    }
}
