public class Car {
    String brand;
    String model;
    int productionYear;

    public Car() {
        this.brand = "Subaru";
        this.model = "Forester";
        this.productionYear = 2012;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.productionYear = 2012;
    }

    public Car(String brand, String model, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }
}
