package Week4;
import java.util.Scanner;

public class ScholarshipChecker
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
                
        System.out.print("Enter your GPA: ");
        double gpa= sc.nextDouble();
        
        System.out.print("Enter attendence percentage: ");
        int attendence = sc.nextInt();
        
        System.out.print("Enter attitude percentage(1-10): ");
        int attitude = sc.nextInt();
        
        if (gpa >= 3.2){
            if(attendence>80){
                if(attitude > 5){
                    System.out.println("yehh You are eligable for Scholarship");
                } else{
                    System.out.println("Not Eligible: Attitude too Low");
                }
            }else {
                System.out.println("Not Eligible: Attendence too low");
            }
        } else {
            System.out.println("Not Eligible: GPA too low");
        }
    }
}