package StaticVariable;
//A static variable is a variable that belongs to the class and not to objects from that class,
// in other words, there is only one version of that variable in memory and is usually used to store
// information that should be shared between all objects

public class main {
    public static void main(String[] args){
        Employee amir = new Employee("amir", 1);
        Employee ahmad = new Employee("ahmad", 2);
        Employee hossein = new Employee("hossein", 3);
        Employee sara = new Employee("sara", 4);

        System.out.println(Employee.companyName);
    }
}
