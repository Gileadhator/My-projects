
import java.util.ArrayList;
import java.util.List;

public class Admin {
    private final List<Vehicle> vehicleFleet;


    public Admin() {
        this.vehicleFleet = new ArrayList<>();
    }

    private void prepopulateFleet() {
        vehicleFleet.add(new Car("001", "Ford", 20.0));
        vehicleFleet.add(new Car("002", "Toyota", 35.0));
        vehicleFleet.add(new Car("003", "Lamborghini", 15.0));
        vehicleFleet.add(new Car("004", "Bugatti", 45.0));


        vehicleFleet.add(new Motorcycle("001", "Honda", 36.0));
        vehicleFleet.add(new Motorcycle("002", "Boxer", 23.0));
        vehicleFleet.add(new Motorcycle("003", "Yamaha", 35.0));
        vehicleFleet.add(new Motorcycle("004", "Suzuki", 26.0));


        vehicleFleet.add(new Truck("001", "Ford", 65.0));
        vehicleFleet.add(new Truck("002", "Chevrolet", 55.0));
        vehicleFleet.add(new Truck("003", "Corolla", 54.0));
        vehicleFleet.add(new Truck("004", "Toyota", 68.0));

    }


    public void displayFleet() {
        if (vehicleFleet.isEmpty()) {
            System.out.println("No vehicles in the fleet.");
        } else {
            System.out.println("Vehicle Fleet:");
            for (Vehicle vehicle : vehicleFleet) {
                System.out.println(vehicle.getClass().getSimpleName() + " - ID: " + vehicle.getVehicleId() + ", Model: " + vehicle.getModel());
            }
        }
    }

    public void displayAvailableVehicles() {
        boolean hasAvailableVehicles = false;
        for (Vehicle vehicle : vehicleFleet) {
            if (vehicle.isAvailable()) {
                System.out.println(vehicle.getClass().getSimpleName() + " - ID: " + vehicle.getVehicleId() + ", Model: " + vehicle.getModel() + ", Rate: $" + vehicle.getBaseRentalRate() + " per day");
                hasAvailableVehicles = true;
            }
        }
        if (!hasAvailableVehicles) {
            System.out.println("No available vehicles.");
        }
    }

}
