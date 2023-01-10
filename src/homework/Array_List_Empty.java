package homework;

import java.util.ArrayList;

//Write a Java program to test an array list is empty or not. Define array list with
//underground tube names
public class Array_List_Empty { //class name
    public static void main(String[] args) { //main method
        ArrayList<String> s1= new ArrayList<String>(); //create an object
        s1.add("Bakerloo Line");
        s1.add("Metropolitan Line");
        s1.add("Jubliee Line");
        s1.add("Central Line");
        s1.add("Hammersmith & City");
        s1.add("Chilton Line");
        System.out.println("Orginal Array List: "+s1); //printing array list
        System.out.println("Checking about Array List is empty or not"+s1.isEmpty()); //will check if array is empty or not

    }
}
