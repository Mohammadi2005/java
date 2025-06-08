package Encapsulation;
// in encapsulation we private the features and used from getter and setter

import inheritance.Animal;

public class Fish extends Animal {

    String color;

    public Fish(String name, int weight, int age, String color) {
        super(name, weight, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void swim(){
        System.out.println(" is swiming");
    }
}
