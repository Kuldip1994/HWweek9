package calculate;

import java.util.Scanner;

import static calculate.Calculator.calculateResult; //imported calculate result method from calculator class

public class Main {

    public static void main(String[] args) { //main method
        char c; //local variable
        do { //declared do loop

            Scanner sc = new Scanner(System.in); // scanner class which will allow user to have their input
            System.out.println("Enter first number"); //print statement
            int a = sc.nextInt(); // allowing user to input only numbers
            System.out.println("Please enter one of symbol +,-,*,/"); // print statement for symbols
            char symbol = sc.next().charAt(0); // allowing user to input only symbol
            System.out.println("Enter second number");
            int b = sc.nextInt();//allowing user to input only numbers
            System.out.println("Total: "); // print statement for total

            calculateResult(a, b, symbol); //method from calucator and in that declare int a ,b and char

            System.out.println("Would you like to do more calculcation Please enter Y or n "); // print statement for user if they want to continue their sum or not

            c = sc.next().charAt(0);
        }
            while (c == 'Y' || c == 'y'); //while loop if user wants to continue with their num or not.


        }
    }

