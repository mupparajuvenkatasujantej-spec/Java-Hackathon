import java.util.Scanner;

public class Part3c_Methods {

    // Method to calculate total waste from two collection points
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 3c) Calculate Total Waste from 2 Points ===");
        System.out.print("Enter waste collected at Point 1 (kg): ");
        double point1Waste = scanner.nextDouble();

        System.out.print("Enter waste collected at Point 2 (kg): ");
        double point2Waste = scanner.nextDouble();

        // Call the method and display result
        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);
        System.out.println("Total Waste Collected: " + totalWaste + " kg");

        scanner.close();
    }
}