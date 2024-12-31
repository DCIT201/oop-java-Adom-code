import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final String customerId;
    private List<Vehicle> rentalHistory;
    private Vehicle currentRental;

    public Customer(String name, String customerId) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name cannot be null or empty.");
        if (customerId == null || customerId.isEmpty()) throw new IllegalArgumentException("Customer ID cannot be null or empty.");

        this.name = name;
        this.customerId = customerId;
        this.rentalHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public List<Vehicle> getRentalHistory() {
        return rentalHistory;
    }

    public Vehicle getCurrentRental() {
        return currentRental;
    }

    public void rentVehicle(Vehicle vehicle, int days) {
        if (vehicle.isAvailable()) {
            vehicle.setAvailable(false);
            this.currentRental = vehicle;
            rentalHistory.add(vehicle);
        } else {
            throw new IllegalStateException("Vehicle is not available.");
        }
    }

    public void returnVehicle() {
        if (currentRental != null) {
            currentRental.setAvailable(true);
            currentRental = null;
        } else {
            throw new IllegalStateException("No vehicle to return.");
        }
    }
}
