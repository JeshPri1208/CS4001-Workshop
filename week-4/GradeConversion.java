package Week4;
import java.util.Scanner;

public class GradeConversion
{
    public static void main(String[] agrs){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the GPA: ");
    double gpa=sc.nextDouble();
    if(gpa<0.0 || gpa >4.0){
        System.out.println("Please enter the valid GPA: ");
    }
    String grade=" ";
    if(gpa<4 || gpa>3.6){
        grade = "A+";
    }else if(gpa > 3.2 || gpa < 3.6){
        grade = "A";
    
    }else{
        System.out.println("Enter the valid gpa");
    
    }
    
          System.out.println("Grade"+  grade);
    
    
    }
}