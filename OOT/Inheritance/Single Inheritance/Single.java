class Person {  // parent class

    String name;

    void displayName() {
        System.out.println("Name :- " + name);
    }


}

class Student extends Person {
    
    int rollNumber;
    void displayRollNumber() {
        System.out.println("Roll Number:- " + rollNumber);
    }
}

public class Single{

    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Karan";
        s.rollNumber = 21;
        s.displayName();
        s.displayRollNumber();
    }
}