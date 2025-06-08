package Encapsulation;
// in encapsulation we private the features and used from getter and setter

import inheritance.Animal;

public class Brid extends Animal {
    int flyHeight;

    public Brid(String name, int weight, int age, int flyHeight) {
        super(name, weight, age);
        this.flyHeight = flyHeight;
    }


    public void fly(){
        System.out.println(" is flying");
    }

    public int getFlyHeight() {
        return flyHeight;
    }

    public void setFlyHeight(int flyHeight) {
        this.flyHeight = flyHeight;
    }
}
