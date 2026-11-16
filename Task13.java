class Vehicle {
    String make;
    String model;
    int year;
}

class Car extends Vehicle {
    int numberOfDoors;

    void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

public class Task13 {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.make = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2022;
        myCar.numberOfDoors = 4;

        myCar.displayDetails();
    }
}
