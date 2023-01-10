package calculate;

public class Calculator {
    public void addition(int a, int b){ //instance method with two argumment  and no return type
        System.out.println(); //print statement
    }
    public void subtraction (int a, int b){//instance method with two argumment  and no return type
        System.out.println();
    }
    public void division (int a,int b){//instance method with two argumment  and no return type
        System.out.println();
    }
    public void multiplication (int a, int b){//instance method with two argumment  and no return type

    }
    public static int calculateResult(int a, int b, char symbol) { //static  method with three  argumment  and with return type

        int ans = 0; //declared static variable
        if (symbol == '+') { //if statement if user enter symbol '+' it will add the numbers they input
            ans = a + b;
        } else if (symbol == '-') { //if statement if user enter symbol '-' it will subtract the numbers they input
            ans = a - b;
        } else if (symbol == '/') { //if statement if user enter symbol '+' it will divide the numbers they input
            ans = a / b;

        } else if (symbol == '*') { //if statement if user enter symbol '+' it will multiply the numbers they input
            ans = a * b;

        }
        System.out.println("Your answer is: " + ans); // print statement
        return ans;
    }

    }

