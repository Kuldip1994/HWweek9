package homework;
/*
Write a class with the name SimpleCalculator. The class needstwo fields(instance variables) with
names firstNumber and secondNumber both of type double.
Write the following methods(instance methods):
● Method named getFirstNumber without any parameters, it needsto return the value of the
firstNumber field.
● Method named getSecondNumber without any parameters, it needs to return the value of
the secondNumber field.
● Method named setFirstNumber with one parameter oftype double, it needsto set the value
of the firstNumber field.
● *Method named setSecondNumber with one parameter oftype double, it needsto set the
value of the secondNumber field.
● Method named getAdditionResult without any parameters, it needsto return the result of
adding the field values of firstNumber and secondNumber.
● Method named getSubtractionResult without any parameters, it needsto return the result of
subtracting the field values of the secondNumber from the firstNumber.
● Method named getMultiplicationResult without any parameters, it needsto return the result
of multiplying the field values of firstNumber and secondNumber.
● Method named getDivisionResult without any parameters, it needsto return the result of
dividing the field values of firstNumber by the secondNumber. In case the value of
secondNumber is 0 then return 0.
 */
public class Sum_Calculator {
    private double firstnumber; //instance variable
    private double secondnumber; //instance variable

    public double getFirstnumber() { //instance method without parameter
        return firstnumber;
    }
    public double getSecondnumber(){ //instance method without parameter
        return secondnumber;
    }

    public void setFirstnumber(double firstnumber) { //instance method with parameter
        this.firstnumber = firstnumber;
    }

    public void setSecondnumber(double secondnumber) { //instance method with parameter
        this.secondnumber = secondnumber;
    }
    public double getAdditionResult(){ //instnace method without any parameter
        return firstnumber + secondnumber;
    }
    public double getSubtractionResult(){ //instnace method without any parameter
        return firstnumber - secondnumber;
    }
    public double getMultiplicationResult(){ //instnace method without any parameter
        return firstnumber * secondnumber;
    }
    public double getDivisionResult(){ //instnace method without any parameter
        if(secondnumber == 0) {
            return this.secondnumber = 0;
        }else {
            return firstnumber/secondnumber;
        }
    }

    public static void main(String[] args) { //main method
        Sum_Calculator calculator = new Sum_Calculator();
        calculator.setFirstnumber(5.0);
        calculator.setSecondnumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstnumber(5.25);
        calculator.setSecondnumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }

}
