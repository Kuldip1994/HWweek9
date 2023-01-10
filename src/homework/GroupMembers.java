package homework;

import java.util.ArrayList;

//Write program and add all group members names in to array and iterates
//through for each loop and print your name.
public class GroupMembers { //declare class name
    public static void main(String [] args){ // main method
        ArrayList<String> groupmember = new ArrayList<>(); //creating array list
        groupmember.add("Kuldip");
        groupmember.add("Bhumi");
        groupmember.add("Urvi");
        groupmember.add("Dipali");
        groupmember.add("Sonia");
        System.out.println("ArrayList : "+groupmember);

        System.out.println("Iterating over ArrayList using for each loop");

        for (String name : groupmember){ // for loop
            System.out.println("Kuldip"); //print statement
            break;
        }

    }

}
