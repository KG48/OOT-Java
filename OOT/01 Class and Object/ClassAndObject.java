class Student {
    String name;
    int age;
    String branch;

    void study() {
        System.out.println(name + " is studying.");
    }

    void display() {
        System.out.println("Name :- " + name);
        System.out.println("Age :- " + age);
        System.out.println("Branch :- " + branch);
    }
}

public class ClassAndObject {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Karan";
        s1.age = 21;
        s1.branch = "CSE";

        s1.display();
        s1.study();
    }
}
