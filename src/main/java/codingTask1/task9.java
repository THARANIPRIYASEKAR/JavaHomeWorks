package codingTask1;

public class task9 {
    public static void main(String[] args) {

        /* Write a java program to find the second-largest number in the array */

        int[] arrayValues = {10, 56, 23, 98, 34, 25, 76, 89, 61};
        int temp;

        for (int i = 0; i < arrayValues.length; i++) {
            for (int j = i + 1; j < arrayValues.length; j++) {

                if (arrayValues[i] >= arrayValues[j]) {
                    temp = arrayValues[i];
                    arrayValues[i] = arrayValues[j];
                    arrayValues[j] = temp;
                }
            }
        }


        System.out.println("The Second Largest number is: " + arrayValues[arrayValues.length-2]);

        //method2

        int largest = arrayValues[0];
        int secondLargest = arrayValues[0];

        for (int i = 0; i < arrayValues.length; i++) {
            if (arrayValues[i]>largest) {
                secondLargest=largest;
                largest=arrayValues[i];
            } else if (arrayValues[i]>secondLargest && arrayValues[i] != largest) {
                secondLargest=arrayValues[i];
            }

        }
        System.out.println(secondLargest);

    }
}
