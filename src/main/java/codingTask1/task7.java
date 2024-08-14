package codingTask1;

public class task7 {
    public static void main(String[] args) {

        /* Write a Java Program to print the first 10 numbers of Fibonacci series */

        int[] fibonacciSeries = new int[10];
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;
        System.out.print(fibonacciSeries[0] + " ");
        System.out.print(fibonacciSeries[1] + " ");
        for (int i = 2; i < 10; i++) {

            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];

            System.out.print(fibonacciSeries[i] + " ");
        }

        //  Method2
        int n = 10;
        int first = 0;
        int second = 1;
        int next = 0;

        System.out.println();
        System.out.print("0 1 ");

        for (int i = 0; i < n - 2; i++) {

            next = first + second;
            first = second;
            second = next;
            System.out.print(next + " ");

        }
    }
}
