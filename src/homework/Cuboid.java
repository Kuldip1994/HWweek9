package homework;

public class Cuboid extends Rectangle {
    private double height; //instance variable
    public Cuboid(double width, double length, double height) { //instance method with parameter
        super(width, length); //called from recetagle class
        if (height < 0) { //if statement
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    public double getHeight() { //instnace menthod without parameteter
        return height;
    }
    public double getVolume() { //instnace menthod without parameteter
        return (getArea() * height);
    }
}
