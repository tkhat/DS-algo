package fibonacci;

public class TestFibonacci {
    public static void main(String[] args) {

        FIteration f = new FIteration();
        System.out.println(f.fib(6));

        FRecursion fi = new FRecursion();
        System.out.println(fi.fib(6));

    }
}
