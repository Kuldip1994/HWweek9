package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) { //main method
        Encapsulate obj = new Encapsulate(); //created object of Encapsulate class
        obj.setName("Bhavesh"); //called from Encapsulate class
        obj.setAge(19); //called from Encapsulate class
        obj.setRollNo(51); //called from Encapsulate class

        System.out.println("CodeBusters name: " +obj.getName()); //print statement
        System.out.println("CodeBuster Age: " +obj.getAge());
        System.out.println("CodeBuster rollNo: "+obj+ obj.getRollNo());
    }
}
