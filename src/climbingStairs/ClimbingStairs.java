package climbingStairs;


public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++) {
            int local = second;
            second = first + second;
            first = local;
        }
        return second;
    }
}
