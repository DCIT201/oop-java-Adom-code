import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;
    private List<RentalTransaction> transactions;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public Vehicle findAvailableVehicle(String model) {
        return fleet.stream()
                .filter(vehicle -> vehicle.isAvailable() && vehicle.getModel().equalsIgnoreCase(model))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No available vehicle of this model."));
    }

    public void processRental(Customer customer, String model, int days) {
        Vehicle vehicle = findAvailableVehicle(model);
        double cost = vehicle.calculateRentalCost(days);
        customer.rentVehicle(vehicle, days);

        RentalTransaction transaction = new RentalTransaction(customer, vehicle, days, cost);
        transactions.add(transaction);
    }

    public void returnVehicle(Customer customer) {
        customer.returnVehicle();
    }
}