package homework;

import java.util.ArrayList;

public class All_Group_Name { //declare class
    public static void main(String[] args) { //main method
        ArrayList<String> groupnames = new ArrayList<>(); //create an object
        groupnames.add("Java");
        groupnames.add("Restassure");
        groupnames.add("Selenium");
        groupnames.add("Postman");
        System.out.println("ArrayList :  "+groupnames); //print statement


        System.out.println("Interating over ArrayList using for each loop"); //for loop
        for (String groupname: groupnames)
        {
            System.out.println(groupname);
            System.out.println(", ");
        }
    }
}
