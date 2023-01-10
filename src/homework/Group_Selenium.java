package homework;
//Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map.

import java.util.HashMap;

public class Group_Selenium { // declare class name
    public static void main(String[] args) { //main method
        HashMap<String, Integer> group = new HashMap<String, Integer>();// create hashmap object called people

        group.put("Kuldip", 31); //add key and value (string and integer)
        group.put("Bhumi", 32);
        group.put("Urvi", 33);
        group.put("Dipali", 34);
        group.put("Soniya", 35);

        for (String i : group.keySet()) { //for loop
            System.out.println("Key : " + i + " value: " + group.get(i));
        }
    }
}
