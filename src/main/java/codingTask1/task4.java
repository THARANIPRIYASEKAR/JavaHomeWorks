package codingTask1;

public class task4 {
    public static void main(String[] args) {

        /* Create a 2D array of integers. Develop a program which will calculate the
          sum of even and odd numbers for that array.*/

        int[][] twoDArray = {
                {3, 9, 11, 5},
                {2, 4, 1},
                {5, 7, 1, 8, 6}
        };

        int sumOfEVen = 0, sumOfOdd = 0;

        for (int row = 0; row < twoDArray.length; row++) { //outer loop
            for (int column = 0; column < twoDArray[row].length; column++) { //inner loop

                //calculating the sum of even numbers
                if (twoDArray[row][column] % 2 == 0) {
                    sumOfEVen += twoDArray[row][column];
                }
                //calculating the sum of odd numbers
                else {
                    sumOfOdd += twoDArray[row][column];
                }
            }
        }

        System.out.println("Sum of the Odd numbers: " + sumOfOdd);
        System.out.println("Sum of the Even numbers: " + sumOfEVen);
        System.out.println("Sum of even and odd numbers: " + (sumOfEVen+sumOfOdd));
    }
}
