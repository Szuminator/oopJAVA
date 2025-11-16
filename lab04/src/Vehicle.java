public class Vehicle {
    String brand;
    String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors){
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }
}
