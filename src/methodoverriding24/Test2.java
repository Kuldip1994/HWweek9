package methodoverriding24;

public class Test2 { //declare class
    public static void main(String[] args) { //main method
        SBI s = new  SBI(); // created class
        ICIC i = new ICIC();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest: " +s.getRateOfInterest()); //print statement
        System.out.println("ICIC Rate of Interest: " +i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " +a.getRateOfInterest());


    }
}
