package Week4;
import java.util.Scanner;
public class NepalIncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your annual income (NPR): ");
        double income = sc.nextDouble();
        double tax = 0;

        //Apply progressive tax brackets
        if (income <= 500000) {
            tax = income * 0.01;
        } else if (income <= 700000) {
            tax = 5000 + (income - 500000) * 0.10;
        } else if (income <= 1000000) {
            tax = 15000 + (income - 700000) * 0.20;
        } else if (income <= 2000000) {
            tax = 35000 + (income - 1000000) * 0.30;
        } else if (income <= 5000000) {
            tax = 335000 + (income - 2000000) * 0.36;
        } else {
            tax = 1135000 + (income - 5000000) * 0.39;
        }

        System.out.println("Total Tax Payable: NPR " + tax);
    }
}