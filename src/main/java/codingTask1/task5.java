package codingTask1;

public class task5 {
    public static void main(String[] args) {

        /*Write a program to swap 2 numbers without a temporary variable */
        int num1 = 15;
        int num2 = 30;

        //print the numbers before swap
        System.out.println("Before Swap");
        System.out.println(num1);
        System.out.println(num2);

        //swapping the numbers without a temporary variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        // print the numbers after swap
        System.out.println("After Swap");
        System.out.println(num1);
        System.out.println(num2);

    }
}
