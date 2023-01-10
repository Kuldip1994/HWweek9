package homework;

import java.util.Scanner;

//1. Read 10 numbers from the console entered by the user and print the sum of
//thosenumbers.
//-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
//-If hasNextInt() returnsfalse, print the message Invalid Number. Continue reading until you have read
//10 numbers.
//-Use the nextInt() method to get the number and add itto the sum.
//-Before the user enters each number, print the message Enter number #x: where x representsthe
//count, i.e. 1, 2, 3, 4, etc.
//-For example,the first message printed to the user would be Enter number #1:,the next Enter number
//#2:, and so on.
//Hint:
//-Use a while loop.
//-Use a counter variable for counting valid numbers.
//-Close the scanner after you don't need it anymore.
//-Create a class with the name ReadingUserInputChallenge.
public class ReadingUserInputChallenge {
    public static void main(String[] args) { //main method

       Scanner sc = new Scanner(System.in);  ////scanner class to allow user to input the values
       System.out.println("Please enter 10 numbers  : "); //print statement
       int number =0; //local variable
       int total = 0; //local variable
       int counter = 0; //local variable
       while (counter<10){ //while loop
           System.out.println("Enter number  #"  +(counter +1)); // print statment which will say enter number
           boolean hasNextInt = sc.hasNextInt(); //boolean which will tell user if they have eneterd letters instead number
           if (hasNextInt){//if statement
               number = sc.nextInt();
               counter++; //
               total+=number;

           }else{
               System.out.println("invalid! Try again " ); // if entered letters then this will tell user to input numbers
               sc = new Scanner(System.in);
           }
       }
       sc.close(); // closing the scanner
        System.out.println("Your total is  "+total); // total sum

        }
    }
