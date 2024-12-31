public class Car extends Vehicle {
    private boolean hasGPS;

    public Car(String vehicleId, String model, double baseRentalRate, boolean hasGPS) {
        super(vehicleId, model, baseRentalRate);
        this.hasGPS = hasGPS;
    }

    public boolean hasGPS() {
        return hasGPS;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getBaseRentalRate() + (hasGPS ? 10 : 0); // Extra cost for GPS
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
