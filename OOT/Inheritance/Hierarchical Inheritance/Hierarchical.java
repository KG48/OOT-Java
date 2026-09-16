
class Person {

    String name;

    void displayName() {
        System.out.println("Name :- " + name);
    }
}

class Student extends Person{
    
    int rollNumber;

    void displayRollNumber() {
        System.out.println("roll Number :- " + rollNumber);
    }
}

class Teacher extends Person {

    String subject;

    void displaySubject() {
        System.out.println("Subject :- " + subject);
    }
} 


public class Hierarchical {

    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Karan";
        s.rollNumber = 101;

        s.displayName();
        s.displayRollNumber();

        Teacher t = new Teacher();
        t.name = "Priya";
        t.subject = "Java";

        t.displayName();
        t.displayName();
    }
    
}
