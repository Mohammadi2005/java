package Polymorohism;

public class Chiken extends Brid{

    public Chiken(String name, int weight, int age, int flyHeight) {
        super(name, weight, age, flyHeight);
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + "i'm not able to fly ... ");
    }

}
