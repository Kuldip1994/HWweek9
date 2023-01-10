package homework;

public class Student5 { //delcare class
    int id; //instance variable
    String name; //instance variable
    int age; //instance variable

    Student5(int i,String n){ //instance method with two argument constructor
        id=i;
        name=n;
    }
    Student5(int i,String n, int a){ //instance method with three argument constructor
        id=i;
        name= n;
        age = a;
    }
    public void display() {//instnace menthod without return type
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) { //main method
        Student5 s1=new Student5(111,"Karan");
        Student5 s2 = new Student5(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}
