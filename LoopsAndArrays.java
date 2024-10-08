// Tl 08/29/2024
/*
* LoopsAndArrays.java
*
* This program will use the for loop to loop through
* a list of names stored in a string array.
*
*
*
*/
import java.util.Scanner;

import java.util.Scanner;

public class LoopsAndArrays {
    public static void main(String[] args) {

        // Create a Scanner object for user input.
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Welcome to my Friendly For Loop Program \n");

        // Create a floor loop that displays "Hello There!" five times.

        // the loop control variable
        // is named i (it means integer (whole number).
        // this loop control variable must be; initialized, checked, and change.
        for (int i = 0; i < 10; i++ ) {
            System.out.println("The value of i is: " + i);
        }

        // Create a while loop that does the same thing.
        int loopControlVariable = 0;
        while (loopControlVariable < 10) {
            System.out.println("The value of the loopControlVariable is: " + loopControlVariable);
            // Change the loop control variable.
            loopControlVariable++;
        }

        // Create a String array of five words.
        // String[] names = new String[10];
        String[] names = {"one","two","three","four","five","six","seven","eight","nine","ten"};

        // Create an int array with 10
        int[] myNumbers = new int[10];

        // Use a loop to get ten whole numbers from the user.
        for (int i = 0; i <10; i++) {
            System.out.println("Please enter number " + (i+1) );
            myNumbers[i] = scanner.nextInt();
        }

        // Output the myNumbers[] array .... with a for loop, using the length property
        for (int i=0; i<10; i++) {
            System.out.println("The value of myNumbers[" + i + "] is: " + myNumbers[1]);
        }

        System.out.println("\n One of our names is: " + names[4]);
        //Output the length of our array named name.
        System.out.println("\n The length of our array 'name' is: " + names.length);

        // Create a for loop that output all elements values in the names array.
        for (int i = 0; i < 12; i++) {
            System.out.println("names[" + i + "] is..." + names[i]);
        }


        System.out.println("\n This is the end of our program \n");


    }
}