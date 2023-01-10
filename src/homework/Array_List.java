package homework;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to create a new array list, add some colours(string) and
//printout the collection using for each loop.
public class Array_List {

    public static void main (String [] args){ //main method
        List<String> colours_String = new ArrayList<>(); //create an object
        colours_String.add("Blue");
        colours_String.add("Orange");
        colours_String.add("Red");
        colours_String.add("Purple");
        colours_String.add("Green");
        colours_String.add("Pink");
        colours_String.add("Yellow");

        for (String multi:colours_String){ //for loop
            System.out.println(multi);
        }





    }

}
