package homework;

import java.util.Scanner;

public class Mark_Sheet { //declare class
    public static void main(String[] args) { //main method

        Scanner sc = new Scanner(System.in); //scanner class for user input
        int maths, science, english; //declared local variable
        System.out.println("Enter Student Name"); //print statement
        String a = sc.next(); //only letters can be typed as only string accepeted
        System.out.println("Enter Student Roll no");
        int b = sc.nextInt(); //only number can be entered by user
        System.out.println("Maths Marks");
        maths = sc.nextInt();//only number can be entered by user
        System.out.println("Science Marks");
        science = sc.nextInt();//only number can be entered by user
        System.out.println("English Marks");
        english = sc.nextInt();//only number can be entered by user


        float sum = maths + science + english; //used float to add total marks of students
        System.out.println("The sum of the total marks of all subjects : " + sum); //printed the total marks
        int total = 300; // declare int with total 300 as the total marks are 300
        System.out.println("Total Marks : " + total); //total marks print statement
        float per = sum / total * 100; // to work out percantage of sum/total and * to give percentage
        System.out.println("Total percentage  :" + per); //printed the percentage

        if (per >= 80) { // if statemet
            System.out.println("Grade A+");
        } else if (per >= 60) {
            System.out.println("Grade A ");
        } else if (per >= 50) {
            System.out.println("Grade B");
        } else if (per >= 35) {
            System.out.println("Grade C");

        } else if (per < 34) {
            System.out.println("Fail");
        }
        while (per < 35) { // while loop is for below 35% would mean grade not pass
            System.out.println("Grade not pass");
            break; // given break statment as it will stop the loop
        }
    }
}
