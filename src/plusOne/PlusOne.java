package plusOne;

import java.math.BigInteger;
import java.util.ArrayList;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = (digits[i] + 1);
                return digits;
            } else if (i == 0) {
                int[] res = new int[digits.length + 1];
                for (int j = 0; j < res.length; j++) {
                    if (j == 0) {
                        res[j] = 1;
                    } else {
                        res[j] = 0;
                    }
                }
                return res;
            } else {
                digits[i] = 0;
            }
        }
        return digits;
    }
}
