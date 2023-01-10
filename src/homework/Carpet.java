package homework;
//2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of
//type double.
public class Carpet { //declare class
    private double cost; //instance variable

    public Carpet(double cost) { //instance method with parameter

        this.cost = cost;
    }
    public double getCost() { //instance method
        if( cost < 0) { //if statement
            cost = 0;
        }
        return this.cost;
    }
}

