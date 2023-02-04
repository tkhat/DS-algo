package checkIfExist;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckIfExist {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> whatIneed = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (whatIneed.contains(arr[i])) {
                return true;
            } else {
                if (arr[i] == 0) {
                    whatIneed.add(0);
                }
                if (arr[i] % 2 == 0) {
                    whatIneed.add((arr[i] / 2));
                }
                whatIneed.add((arr[i] * 2));
            }
        }
        return false;
    }
}
