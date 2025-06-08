package InterFace;
// in encapsulation we private the features and used from getter and setter

// interface is a data type that can include abstract methods and fixed variably
// and makes the programmer define contracts for the class


public class Animal {
    protected String name;
    protected int weight;
    protected int age;

    public Animal(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 150 && weight > 10)
            this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 50 && age > 0)
            this.age = age;
    }

    public void eat(){
        System.out.println(this.name + " eating");
    }
    public void sleep(){
        System.out.println(this.name + " aleeping");
    }
}
