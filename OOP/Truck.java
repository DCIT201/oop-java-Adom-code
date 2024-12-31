public class Truck extends Vehicle {
    private double loadCapacity; // Capacity in tons

    public Truck(String vehicleId, String model, double baseRentalRate, double loadCapacity) {
        super(vehicleId, model, baseRentalRate);
        if (loadCapacity <= 0) throw new IllegalArgumentException("Load capacity must be greater than zero.");
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getBaseRentalRate() + (loadCapacity * 5); // Extra cost based on load
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}