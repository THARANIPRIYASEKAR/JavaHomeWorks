package codingTask1;

public class task10 {
    public static void main(String[] args) {

        /* Write a program to print out duplicate elements from an Array of Strings? */

        String[] duplicateValues = {"a", "e", "i", "i", "o", "o", "u"};

        for (int i = 0; i < duplicateValues.length; i++) {
            for (int j = i + 1; j < duplicateValues.length; j++) {

                if (duplicateValues[i].equals(duplicateValues[j])) {
                    System.out.println(duplicateValues[i]);
                }

            }
        }
    }
}
