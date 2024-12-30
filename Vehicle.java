public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        if (vehicleId ==null) {
            System.out.println("Vehicle id cannot be null");
        }else {
            this.vehicleId = vehicleId;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null) {
            System.out.println("Vehicle model cannot be empty");
        }else {
            this.model = model;
        }
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        if (baseRentalRate < 0) {
            System.out.println("BaseRentalRate cannot be negative");
        }else {
            this.baseRentalRate = baseRentalRate;
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        if (isAvailable == true) {
            this.isAvailable = true;
        }else{
            this.isAvailable = false;
        }

    }

    public abstract double calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();
}