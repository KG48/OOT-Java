class Car {
    String make;
    String model;
    int year;

    public Car (String make, String model, int year) 
    {
        this.make = make;
        this.model = model;
        this.year = year;
        System.out.println("A new car object has been created");

    }

    public void displayDetails() {
        System.out.println("Car Details " + this.year +" " + this.make+ " " + this.model);

    }

}

public class Lab1 {

    public static void main(String[]args) {
        Car myCar = new Car(make: "Toyota", model:"Camry", year: 2023);
        myCar.displayDetails();
    }
}