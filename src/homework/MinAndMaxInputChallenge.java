package homework;

import java.util.Scanner;

//-Read the numbers from the console entered by the user and print the
//minimumand maximum number the user has entered.
//-Before the user enters the number, print the message Enter number:
//-If the user enters an invalid number, break out of the loop and print the minimum and maximum
//number.
//Hint:
//-Use an endless while loop.
//-Create a class with the name MinAndMaxInputChallenge.
public class MinAndMaxInputChallenge {

    public static void main (String [] args){ //main method
        int count = 0; //local variable
        int max = 0;//local variable
        int min = 0;//local variable
        boolean first = true; // first number enter has to be number if eneterd

        Scanner sc = new Scanner(System.in); //scanner class for user input
        while(true){ //while loop

            System.out.println("Enter a number: ");
            boolean hashNextInt = sc.hasNextInt(); // boolean for true or false

            count += 1;
            if(hashNextInt) { //if statement

                int storedNumber = sc.nextInt();

                if(first){
                    first = false;
                    min = storedNumber;
                    max = storedNumber;
                }

                if(storedNumber > max) {
                    max = storedNumber;
                }

                if(storedNumber < min) {
                    min = storedNumber;
                }

                if(count == 5) {
                    break;
                }
            } else {

                System.out.println("Invalid number");
                break;
            }

            sc.nextLine(); // Handle nextline input (?) QUESTION
        }

        System.out.println("The minimum number of this: " + min);
        System.out.println("The maximum number of this: " + max);

        sc.close(); //closed the scanner

    }

}
