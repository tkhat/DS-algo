package recursion;

public class RecursionForFun {


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};


        System.out.println("sarch in array " + searchInRecursiveWay(0,arr,4));
        System.out.println("calculate factorial for 10 " + factorialInRecursiveWay(10));
        System.out.println("calculate fibonacci to 10th " + fibonacciInRecursiveWay(10));
    }

    static int searchInRecursiveWay(int index, int[] arr, int target) {
        if (index < arr.length) {
            if (arr[index] == target) {
                return index;
            } else {
                index = searchInRecursiveWay((index += 1), arr, target);
            }
        } else {
            return -1;
        }
        return index;
    }
    static int factorialInRecursiveWay(int n){
        if (n == 1){
            return 1;
        } else {
            return n * factorialInRecursiveWay(n-1);
        }
    }
    static int fibonacciInRecursiveWay(int nth){
        if (nth  > 1){
            return fibonacciInRecursiveWay(nth -1) + fibonacciInRecursiveWay(nth -2);
        } else {
            return nth;
        }
    }
}
