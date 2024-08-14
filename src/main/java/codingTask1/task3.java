package codingTask1;

public class task3 {
    public static void main(String[] args) {

        /*Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program which will identify/print the even numbers only*/

        int[][] twoDArray = {
                {3, 9, 11},
                {2, 8, 4, 1},
                {5, 7, 1, 5, 6},
                {24, 3}
        };

        for (int row = 0; row < twoDArray.length; row++) { //outer loop
            for (int column = 0; column < twoDArray[row].length; column++) { //inner loop

                //identify the even now using mod operation
                if (twoDArray[row][column] % 2 == 0) {

                    System.out.println(twoDArray[row][column]);

                }

            }
        }
        System.out.println("using enhanced for loop");
        // using enhanced for loop
        for (int[] row : twoDArray) {
            for (int column : row) {

                if (column % 2 == 0) {

                    System.out.println(column);

                }
            }
        }
    }
}
