package Week4;
import java.util.Scanner;
public class SellingPriceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marked price: ");
        double markedPrice = sc.nextDouble();

        System.out.print("Enter category (A/B/C/D): ");
        char category = sc.next().charAt(0);

        double discount = 0;

        switch (category) {
            case 'a':
                discount = 0.60;
                break;
            case 'b':
                discount = 0.40;
                break;
            case 'c':
                discount = 0.20;
                break;
            case 'd':
                discount = 0.10;
                break;
            default:
                System.out.println("Invalid category.");
                return;
        }

        double sellingPrice = markedPrice - (markedPrice * discount);
        System.out.println("Selling Price: " + sellingPrice);
    }
}
