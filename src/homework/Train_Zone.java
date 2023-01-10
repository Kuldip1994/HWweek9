package homework;

import java.util.HashMap;

//Write the program that tell you which line pass through particular stations.
//Just use Zone 1 stations name.
public class Train_Zone { //declare class
    public static void main(String[] args) { //main method
        HashMap<String, String> stationlines = new HashMap<String, String>();

        stationlines.put("Angel", "Picadilly"); //Add key (station name) and value (Line name)
        stationlines.put("Waterloo","Bakerloo");
        stationlines.put("Edgware Road", "Bakerloo");
        stationlines.put("Vauxhall", "Victoria");
        stationlines.put("Marylebone", "Bakerloo");

        System.out.println("Station and lines in Zone 1:");
        System.out.println(stationlines);
    }

}
