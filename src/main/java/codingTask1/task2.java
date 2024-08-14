package codingTask1;

public class task2 {
    public static void main(String[] args) {

        /*Create an array of integer values. After the array is created, calculate the
        sum of all stored elements in that array */

        int[] values = {10, 40, 20, 34, 45, 89};
        int sumOfArray = 0;

        // calculating sum
        for (int sum : values) {
            sumOfArray += sum;
        }

        //printing the sum
        System.out.println("Sum of the Array is: " + sumOfArray);
    }
}
