
// Base Vehicle class
class Vehicle {
    // Method to start the vehicle
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    // Method to display vehicle type
    public void displayVehicleType() {
        System.out.println("This is a generic vehicle.");
        start();  // Call the start method
    }
}

// Car class extending Vehicle
class Car extends Vehicle {
    // Override start method for Car
    @Override
    public void start() {
        System.out.println("Car is starting with a key turn.");
    }

    // Override displayVehicleType method for Car
    @Override
    public void displayVehicleType() {
        System.out.println("This is a Car.");
        start();  // Call the overridden start method
    }
}

// Truck class extending Vehicle
class Truck extends Vehicle {
    // Override start method for Truck
    @Override
    public void start() {
        System.out.println("Truck is starting with a heavy-duty engine roar.");
    }

    // Override displayVehicleType method for Truck
    @Override
    public void displayVehicleType() {
        System.out.println("This is a Truck.");
        start();  // Call the overridden start method
    }
}

// Main class to test the vehicle hierarchy
public class VehicleTest {
    public static void main(String[] args) {
        // Create instances of each vehicle type
        Vehicle genericVehicle = new Vehicle();
        Vehicle car = new Car();  // Car as a Vehicle
        Vehicle truck = new Truck();  // Truck as a Vehicle

        // Display vehicle types and start each vehicle
        System.out.println("Generic Vehicle:");
        genericVehicle.displayVehicleType();
        
        System.out.println("\nCar:");
        car.displayVehicleType();
        
        System.out.println("\nTruck:");
        truck.displayVehicleType();
    }
}
