package Week4;
import java.util.Scanner;

public class ClassRoutine
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Day: ");
        String day= sc.nextLine();
        
        System.out.println("\n Class Routine for "+ day  +":\n");
        
        switch(day){
            case "Sunday":
                System.out.println("08:00-09:30 \nLT-07 Innovate Tech\t\tLeacture\t\tComputer Hardware ");
                System.out.println("10:00-12:00 \nLT-07 Innovate tech\t\tLeacture\t\tProgramming ");
                break;
            case "Monday":
                System.out.println("12:30-02:00 \nLT-Guild Hall\t\tLeacture\t\tInformation System ");
                System.out.println("02:30-04:00 \nLT-Guild Hall\t\tLeacture\t\tLogic and problem solving ");
                break;
            case "Tuesday":
                System.out.println("12:30-02:30 \nTR-04 Sunkoshi\t\tTutorial\t\tLogic and Problem solving ");
                System.out.println("03:00-04:00 \nTR-04 Sunkoshi\t\tTutorial\t\tComputer Hardware");
                break;
            case "Wednesday":
                System.out.println("12:30-02:00 \nTR-10 Rara\t\tWorkshop\t\tComputer Hardware ");
                System.out.println("02:30-04:00 \nTR-10 Rara\t\tTutorial\t\tprogramming ");
                break;
            case "Thursday":
                System.out.println("08:00-09:30 \nTR-07 Rara\t\tTutorial\t\tInformation System ");
                System.out.println("10:30-12:00 \nTR-07 Gosaikunda\t\tWorkshop\t\tProgramming ");
                break;
            case "Friday":
                System.out.println("08:00-09:30 \nTR-07 Rara\t\tWorkshop\t\tLogic and problem solving ");
                System.out.println("10:30-12:00 \nTR-07 Rara\t\tWorkshop\t\tInformation system  ");
                break;        
        }
    }
}