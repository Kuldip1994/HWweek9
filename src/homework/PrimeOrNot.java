package homework;
//Write a programme to input any number and check if it is prime or not.
//(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
//prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
//17... are the prime numbers.)
public class PrimeOrNot {

    public static void main (String [] args) { //main method
        int num =29; //local variable
        boolean flag = false; // true or false
        for(int i = 2; i<= num /2;++i){
            if(num % i ==0){
                flag = true;
                break;
            }
        }
        if(!flag) //for loop
            System.out.println(num  + "is a prime number  "); //print statement
        else
            System.out.println(num + "is not a prime number ");
    }


}
