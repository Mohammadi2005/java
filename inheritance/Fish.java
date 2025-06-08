package inheritance;

public class Fish extends Animal{

    String color;

    public Fish(String name, int weight, int age, String color) {
        super(name, weight, age);
        this.color = color;
    }

    public void swim(){
        System.out.println(this.name + " is swiming");
    }
}
