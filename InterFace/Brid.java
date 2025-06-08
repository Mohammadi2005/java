package InterFace;
// in encapsulation we private the features and used from getter and setter

// interface is a data type that can include abstract methods and fixed variably
// and makes the programmer define contracts for the class


import inheritance.Animal;

public class Brid extends Animal {

    int flyHeight;
    public Brid(String name, int weight, int age, int flyHeight) {
        super(name, weight, age);
        this.flyHeight = flyHeight;
    }

}
