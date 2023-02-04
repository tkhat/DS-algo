package plusOne;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        PlusOne pl = new PlusOne();
        int[] digits = new int[]{8,9,9,9};
         int[] res =pl.plusOne(digits);

        for (int i =0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }
}
