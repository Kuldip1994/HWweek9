package homework;

public class Cylinder extends Circle {
    private double height; // instance variable

    public Cylinder(double radius, double height) { //instnace menthod with parameteter
        super(radius);//called from circle class
        this.height = height;
    }

    public double getHeight() { //instnace menthod without parameteter
        if (height > 0) {
            return height;
        } else {
            height = 0;
            return height;
        }
    }

    public double getVolume() { //instnace menthod without parameteter
        double area = getArea() * getHeight();
        return area;
    }
}