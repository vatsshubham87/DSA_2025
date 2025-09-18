package Recursion;

public class FibonacciSeries {

    public static void main(String[] args) {

        int n = 4;
        System.out.println(fib(n));
    }

    private static int fib(int n) {

        if(n <= 1){
            return n;
        }

        int last = fib(n-1);
        int sLast = fib(n-2);

        return last + sLast;

    }
}
