import java.util.Scanner;

public class Part3a_DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 3a) Vehicle Details Input ===");
        System.out.print("Enter vehicle number: ");
        int vehicleNumber = scanner.nextInt(); // Integer

        System.out.print("Enter waste collected (kg): ");
        double wasteCollected = scanner.nextDouble(); // Decimal value

        System.out.print("Enter number of collection points: ");
        int collectionPoints = scanner.nextInt(); // Integer

        System.out.print("Enter vehicle status (e.g., 'A' for Active, 'I' for Inactive): ");
        char vehicleStatus = scanner.next().charAt(0); // Character

        System.out.println("\n--- Stored Vehicle Details ---");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected: " + wasteCollected + " kg");
        System.out.println("Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);

        scanner.close();
    }
}