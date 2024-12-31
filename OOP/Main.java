public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();
        
        // Add vehicles to the fleet
        agency.addVehicle(new Car("CAR001", "Toyota Corolla", 50.0, true));
        agency.addVehicle(new Motorcycle("MOTO001", "Harley Davidson", 30.0, true));
        agency.addVehicle(new Truck("TRUCK001", "Ford F-150", 70.0, 5.0));
        
        // Create a customer
        Customer customer = new Customer("John Doe", "CUST001");

        // Process a rental
        agency.processRental(customer, "Toyota Corolla", 3);

        // Return the vehicle
        agency.returnVehicle(customer);

        // Print rental history
        System.out.println("Rental history: " + customer.getRentalHistory());
    }
}