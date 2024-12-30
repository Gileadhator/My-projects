
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();

        while (true) {

            System.out.println("Welcome to the Vehicle Rental System:");
            System.out.print("Please select an option: ");
            System.out.println("1. Rent a vehicle");
            System.out.println("2. Return a vehicle");
            System.out.println("3. Display vehicle fleet");
            System.out.println("4. Leave");


            int select = scanner.nextInt();
            scanner.nextLine();

            if (select == 4) {
                System.out.println("Leaving.");




            }else if (select == 3) {
                admin.displayFleet();

            } else if (select == 1) {
                System.out.println("Vehicles available for rent:");
                admin.displayAvailableVehicles();


                // Input customer name
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                Customer customer = new Customer(name);

                System.out.println("Enter the number of rental days");
                int rentDays = scanner.nextInt();
                scanner.nextLine();



            } else if (select == 2) {
                System.out.print("Which car do you want to return: ");
                String vehicleId = scanner.nextLine();

            }
            scanner.close();

        }


    }
}
