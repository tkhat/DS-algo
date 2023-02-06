package fibonacci;

public class FIteration {
    public int fib(int n){
        int first =0;
        int second = 1;

        for (int i =1; i < n; i++){
            int local = second;
            second = first+second;
            first = local;
        }
        return second;
    }
}
