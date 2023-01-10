package homework;
//1. Write a class with the name Floor. The class needstwo fields(instance variables) with name width
//and length of type double.
public class Floor { //decalre class

    private double width; //instance variable
    private double length; //instance variable

    public Floor(double width, double length) { //instance method with parameter
        this.width = width;
        this.length = length;
        if (length < 0) { //if statement
            this.length = 0;
        } else if (width < 0) {
            this.width = 0;
        }
    }

    public double getArea() { //intance method with return type and no parameter
        return this.width*length;
    }
}

