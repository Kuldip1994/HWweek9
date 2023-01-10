package encapsulation26;

public class Encapsulate {
    private String name; //private variable
    private int rollNo; //private variable
    private int age;  //private variable

    public String getName(){ //instance method with zero paramenter and return type
        return name;
    }
    public void setName(String name){  //instance method with one paramenter and no return type
        this.name=name; //this keywoard too call constructor from
    }
    public int getRollNo(){//instance method with zero paramenter and return type
        return rollNo;
    }
    public void setRollNo(int rollNo){ //instance method with one paramenter and no return type
        this.rollNo= rollNo;
    }
    public int getAge(){//instance method with zero paramenter and return type
        return age;
    }
    public void setAge(int age){ //instance method with one paramenter and no return type
        this.age=age;

    }
        }

