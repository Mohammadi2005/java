package inheritance;

public class Brid extends Animal {
    int flyHeight;

    public Brid(String name, int weight, int age, int flyHeight) {
        super(name, weight, age);
        this.flyHeight = flyHeight;
    }


    public void fly(){
        System.out.println(this.name + " is flying");
    }
}
