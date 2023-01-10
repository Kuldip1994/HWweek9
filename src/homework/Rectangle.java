package homework;

public class Rectangle { // declare class

    private double width; //instance variable
    private double length; //insance variable

    public Rectangle(double width, double lenght) { //instance method with parameter
        if ((width < 0) && (lenght < 0)) { //if else
            this.width = 0;
            this.length = 0;
        } else if ((width < 0) && (lenght > 0)) {
            this.width = 0;
            this.length = lenght;
        } else if ((width > 0) && (lenght < 0)) {
            this.width = width;
            this.length = 0;
        } else {
            this.width = width;
            this.length = lenght;
        }
    }

    public double getWidth() { // instance method without parameter
        return width;
    }

    public double getLength() { // instance method without parameter
        return length;
    }

    public double getArea() { // instance method without parameter
        return (width * length);
    }
}
