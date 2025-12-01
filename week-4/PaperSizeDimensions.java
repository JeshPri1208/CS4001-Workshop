package Week4;
import java.util.Scanner;

public class PaperSizeDimensions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter paper size (A0 to A5): ");
        String size = sc.nextLine();

        System.out.println("\n Dimensions for " + size + ":");

        switch (size) {
            case "A0":
                System.out.println("Millimeters: 841 x 1189 mm");
                System.out.println("Inches:33.1 x 46.8 inches");
                break;
            case "A1":
                System.out.println("Millimeters: 594 x 841 mm");
                System.out.println("Inches: 23.4 x 33.1 inches");
                break;
            case "A2":
                System.out.println("Millimeters: 420 x 594 mm");
                System.out.println("Inches: 16.5 x 23.4 inches");
                break;
            case "A3":
                System.out.println("Millimeters: 297 x 420 mm");
                System.out.println("Inches: 11.7 x 16.5 inches");
                break;
            case "A4":
                System.out.println("Millimeters: 210 x 297 mm");
                System.out.println("Inches: 8.3 x 11.7 inches");
                break;
            case "A5":
                System.out.println("Millimeters: 148 x 210 mm");
                System.out.println("Inches: 5.8 x 8.3 inches");
                break;
            default:
                System.out.println("Invalid size. Please enter A0 to A5.");
        }
    }
}