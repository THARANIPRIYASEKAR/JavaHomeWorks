package org.example.example.e32;

import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                          // Create a Scanner object to read input
        char gender;
        int age;
        System.out.println("Please enter your gender: M or F");          // Print prompt for user to enter gender
        gender = input.next().charAt(0);// Capture the gender input
        System.out.println("Please enter your age");                     // Print prompt for user to enter age
        age = input.nextInt();                                           // Capture the age input
                                                                         // Classify based on gender and age
        if(age>25) {                                                    // If age is above 25
         if(gender=='F') {                                              //    If gender is "F", print "Woman"
             System.out.println("Woman");
         }else {                                                        //    Otherwise, print "Man"
             System.out.println("Man");
         }
        }else if (age<=25){                                             // If age is 25 or below
            if(gender=='F') {                                           //    If gender is "F", print "Girl"
                System.out.println("Girl");
            } else {                                                    //    Otherwise, print "Boy"
                System.out.println("Boy");
            }
        }
        input.close();
    }
}
