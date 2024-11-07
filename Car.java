public class Car {
    private String make;
    private String model;
    private int year;
    private double fuelEfficiency;
    private String color;
    public Car(String make, String model, int year, double fuelEfficiency, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelEfficiency = fuelEfficiency;
        this.color = color;
    }
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }
    public String compareFuelEfficiency(Car otherCar) {
        if (this.fuelEfficiency > otherCar.getFuelEfficiency()) {
            return String.format("%s %s is more fuel-efficient than %s %s.",
                    this.make, this.model, otherCar.make, otherCar.model);
        } else if (this.fuelEfficiency < otherCar.getFuelEfficiency()) {
            return String.format("%s %s is more fuel-efficient than %s %s.",
                    otherCar.make, otherCar.model, this.make, this.model);
        } else {
            return String.format("%s %s and %s %s have the same fuel efficiency.",
                    this.make, this.model, otherCar.make, otherCar.model);
        }
    }
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2020, 30.0, "Blue");
        Car car2 = new Car("Honda", "Civic", 2020, 32.0, "Red");
        System.out.println(car1.compareFuelEfficiency(car2));
    }
}

