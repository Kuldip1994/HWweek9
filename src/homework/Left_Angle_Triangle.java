package homework;
//Display left angle triangle of * using nested for loops
//*
//* *
//* * *
//* * * *
//* * * * *

public class Left_Angle_Triangle { //declare class
    public static void main(String args []){//main methid
        int rows = 5; //local variable
        for(int i = 1; i<=rows; i++){ //if statement
            for (int x = 1; x<=i; x++){
                System.out.print("* ");// print statement and print *
            }
            System.out.println("");
        }
    }

}
