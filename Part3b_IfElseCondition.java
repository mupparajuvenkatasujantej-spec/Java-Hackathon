import java.util.Scanner;

public class Part3b_IfElseCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 3b) Waste Collection Status Check ===");
        System.out.print("Enter waste collected (kg): ");
        double wasteCollected = scanner.nextDouble();

        if (wasteCollected >= 100) {
            System.out.println("Collection Target Achieved"); // Target achieved if 100kg or more
        } else {
            System.out.println("More Waste Collection Required");
        }

        scanner.close();
    }
}