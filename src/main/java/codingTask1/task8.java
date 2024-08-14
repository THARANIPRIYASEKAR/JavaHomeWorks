package codingTask1;

public class task8 {
    public static void main(String[] args) {

        /* Maximum and minimum number in the array */

        int[] arrayValues = {10, 56, 23, 98, 34, 25, 4, 76, 89, 61};
        int maxNum, minNum;
        maxNum = minNum = arrayValues[0];

        //finding max and min number in the array
        for (int i = 0; i < arrayValues.length; i++) {
            if (maxNum <= arrayValues[i]) {
                maxNum = arrayValues[i];
            }
            if (minNum >= arrayValues[i]) {
                minNum = arrayValues[i];
            }

        }

        // printing the numbers
        System.out.println("Maximum Number is: " + maxNum);
        System.out.println("Minimum Number is: " + minNum);

    }
}
