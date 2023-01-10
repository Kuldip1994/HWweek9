package homework;

public class Point { //declare class
    private int x; //declare instance variable
    private int y; //declare instance variable


    public Point() { //instance method
        System.out.println("No argument parameter"); //print statement

    }

    public Point(int x, int y) { //declare instance method with parameter
        this.x = x;
        this.y = y;
    }

    public int getx() {//declare instance without parameter
        return x;

    }

    public int getY() { //declare instance without parameter
        return y;
    }

    public void setX(int x) { //declare instance with parameter
        this.x = x;
    }

    public void setY(int y) {//declare instance with parameter
        this.y = y;
    }

    public double distance() { //instance method without parameter
        return distance(0, 0);
    }

    public double distance(int x, int y) { //instance method with parameter
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Point secondPoint) { //declare instance method with parameter

        return distance(secondPoint.x, secondPoint.y);

    }

    public static void main(String[] args) {// declared main method
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
        }
    }
