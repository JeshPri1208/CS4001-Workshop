package Week4;
import java.util.Scanner;

public class EvenOdd
{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        
        if(num % 2 == 0)
        {
            System.out.println(num+ " is odd");
        } else {
            System.out.println(num+" is even.");
        }
        sc.close();
    }
}