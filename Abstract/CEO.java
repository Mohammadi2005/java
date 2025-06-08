package Abstract;
// Abstract class is a class from which an object cannot be created directly and defined as a father
// for other classes, these classes can include abstract methods, abstract methods are methods that
// are only declared and have no body, and child classes must implement the body of these methods

public class CEO extends Employee{
    @Override
    public void paySalary() {
        System.out.println("100 per month");
        System.out.println("13 stuck");
        System.out.println("100 reward");
    }
}
