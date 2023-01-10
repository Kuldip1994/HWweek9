package homework;

public class Circle { // declare class
    private  double radius; // instance variable
    public Circle(double radius) { //instance method with parameter
        this.radius = radius;
    }
    public double getRadius() { //instnace menthod without parameteter
        if(radius < 0){
            radius = 0;
            return radius;
        }else{
            return radius;
        }
    }
    public double getArea(){ //instnace menthod without parameteter
        double area = (radius * radius * Math.PI);
        return area;
    }
}
