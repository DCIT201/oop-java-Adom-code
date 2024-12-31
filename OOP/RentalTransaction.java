public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private int rentalDays;
    private double cost;

    public RentalTransaction(Customer customer, Vehicle vehicle, int rentalDays, double cost) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
        this.cost = cost;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Transaction: " + customer.getName() + " rented " + vehicle.getModel() +
                " for " + rentalDays + " days. Total cost: $" + cost;
    }
}