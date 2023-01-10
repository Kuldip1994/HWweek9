package homework;

import java.util.Scanner;

//Display right angle triangle of @ using nested for loops
//@
//@@
//@@@
//@@@@
//@@@@@
public class Right_Angle_Triangle {
    public static void main (String [] args){ //main method
        int height; //declared local variable
        Scanner sc = new Scanner(System.in); //scanner class for user input

        System.out.println("Enter the height of the triagle"); //print statement
        height=sc.nextInt();
        System.out.println();


        for(int i = 1; i<=height;i++){ //for loop
            for (int j = 1; j<=i; j++){
                System.out.print("@"+ " ");
            }
            System.out.println();
        }
    }


}
