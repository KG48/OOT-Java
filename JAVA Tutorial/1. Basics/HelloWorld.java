
// Print
public class HelloWorld {   // Creates the class name HelloWorld
    
    public static void main(String[] args) {   // main program 
        System.out.println("Hello World!");  // print something to the console
        
        printIntro(); // calling another method 
    }


    public static void printIntro() {   // new method created 

        System.out.println("Hello, this is KG.");
        System.out.println("I am learning Java.");
        System.out.println("My goal is to master Object-Oriented Programming.");
    }
}