package Abstract;
// Abstract class is a class from which an object cannot be created directly and defined as a father
// for other classes, these classes can include abstract methods, abstract methods are methods that
// are only declared and have no body, and child classes must implement the body of these methods

public class Main {
    public static void main(String[] args){

        CEO ceo = new CEO();
        ceo.paySalary();

        CFO cfo = new CFO();
        cfo.paySalary();

        Staff sta = new Staff();
        sta.paySalary();


//        for (int i = 1; i < 10; i++){
            String star = "*";
            for (int j = 0; j < 10; j++){
                System.out.println(star);
                star += "*";
            }
//        }
    }
}
