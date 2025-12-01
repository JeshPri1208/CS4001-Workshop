package Week4;

import java.util.Scanner;

public class SimpleCinemaTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ask for age group
        System.out.print("Enter age group (child/adult/senior): ");
        String ageGroup = sc.nextLine();

        //Ask for movie language
        System.out.print("Enter movie language (nepali/hindi/english): ");
        String language = sc.nextLine();

        //Ask if student
        System.out.print("Are you a student? (yes/no): ");
        String student = sc.nextLine();

        //Ask if festival
        System.out.print("Is it a festival day? (yes/no): ");
        String festival = sc.nextLine();

        //Base price
        int price = 0;
        if (ageGroup.equals("child")) {
            price = 150;
        } else if (ageGroup.equals("adult")) {
            price = 300;
        } else if (ageGroup.equals("senior")) {
            price = 200;
        } else {
            System.out.println("Invalid age group.");
            return;
        }

        //Add surcharge for language
        if (language.equals("hindi")) {
            price = price + 50;
        } else if (language.equals("english")) {
            price = price + 100;
        } else if (!language.equals("nepali")) {
            System.out.println("Invalid language.");
            return;
        }

        //Discounts
        if (student.equals("yes")) {
            price = price - (price * 20 / 100); // 20% off
        }
        if (festival.equals("yes")) {
            price = price - (price * 15 / 100); // 15% off
        }

        System.out.println("Ticket Price: Rs. " + price);
    }
}