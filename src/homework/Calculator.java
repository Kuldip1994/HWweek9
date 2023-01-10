package homework;
//3. Write a class with the name Calculator. The class needstwo fields(instance variables) with name
//floor of type Floor and carpet of type Carpet.
public class Calculator { //declare class

        private Floor floor; //instance variable
        private Carpet carpet; //instance variable

        public Calculator(Floor floor, Carpet carpet) { //instance method with parameter
            this.floor = floor;
            this.carpet = carpet;
        }
        public double getTotalCost () { //instnace method
            return floor.getArea() * carpet.getCost();
        }
    }
