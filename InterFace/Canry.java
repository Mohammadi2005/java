package InterFace;
// interface is a data type that can include abstract methods and fixed variably
// and makes the programmer define contracts for the class


public class Canry extends Brid implements Flyable{


    public Canry(String name, int weight, int age, int flyHeight) {
        super(name, weight, age, flyHeight);
    }


    @Override
    public void fly() {
        System.out.println("i'm Canry and i can fly ... ");
    }
}
