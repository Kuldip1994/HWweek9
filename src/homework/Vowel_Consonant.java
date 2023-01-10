package homework;

import java.util.Scanner;

//Write a Java program that takes the user to provide a single character from the
//alphabet. Print Vowel of Consonant, depending on the user input. If the user input
//Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
//error message.
//For eg:
//Input an alphabet: p
//Expected Output:
//Input letter is Consonant
public class Vowel_Consonant {

    public static void main (String [] args){ // main method

        char ch; //local variable
        Scanner sc = new Scanner(System.in); //scanner class for user input

        System.out.println("Enter an Alphabet"); //user input
        ch = sc.next().charAt(0); //only letters can be entered

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || // if statement for vowel
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            System.out.println("It is a Vowel.");
        else //else if its not vowel
            System.out.println("It is a Consonant");

    }

}
