package week3;

class MathOperations{
    public static void main(String[] args){
        int a=10;
        int b=5;
        
        //arthmetric..
        System.out.println("Addition: " + (a+b));
        System.out.println("Subtraction: " + (a-b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Division: " + (a/b));
        System.out.println("Modulus: " + (a%b));
        
        //relational.....
        System.out.println("Greater Than: " + (a>b));
        System.out.println("Equal To: " + (a==b));
        
        //logical...
        boolean x=true, y=false;
        System.out.println("Logical AND: " + (x&&y));
        System.out.println("Logical OR: " + (x||y));
        System.out.println("Logical NOT: " + (!x));
        //assignment...
        int c = a;
        c += b;
        System.out.println("Assignment: " + c);
        
        //unary..
        System.out.println("Add and Assign: " + (++a));
        System.out.println("Increment: " + (--b));


    }
}

