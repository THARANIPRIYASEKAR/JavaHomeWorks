package codingTask1;

public class task1 {
    public static void main(String[] args) {

        /*Create a program that uses an array to store a list of temperatures for a week,
        and then uses a loop to find the highest and lowest temperature for the week. */

        int[] tempForAWeek = {22, 32, 27, 29, 19, 26, 28};
        int highestTemp, lowestTemp;
        highestTemp = lowestTemp = tempForAWeek[0];

        for (int i = 0; i < tempForAWeek.length; i++) {

            // Finding the highest temperature of the week
            if (highestTemp <= tempForAWeek[i]) {
                highestTemp = tempForAWeek[i];
            }

            // Finding the lowest temperature of the week
            if (lowestTemp >= tempForAWeek[i]) {
                lowestTemp = tempForAWeek[i];
            }

        }

        // printing the highest and lowest temperature for the week
        System.out.println("Highest Temperature of the week is: " + highestTemp + "C");
        System.out.println("Lowest Temperature of the week is: " + lowestTemp + "C");

    }
}
