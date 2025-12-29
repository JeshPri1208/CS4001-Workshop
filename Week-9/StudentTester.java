package week8;

public class StudentTester {
    public static void main(String[] args) {
        //constructor
        Student s1 = new Student("Ram", 123, 12, 2.6);

        //overloaded constructor (naam matra)
        Student s2 = new Student("Iyush Basnet");

        // Student-3
        Student s3 = new Student("Pranish", 111, 19, 3.9);

        // Display info for all students
        System.out.println("---- Student 1 ----");
        s1.displayInfo();
        System.out.println("Is Adult? " + s1.isAdult());
        System.out.println();

        System.out.println("---- Student 2 ----");
        s2.displayInfo();
        System.out.println("Is Adult? " + s2.isAdult());
        System.out.println();

        System.out.println("---- Student 3 ----");
        s3.displayInfo();
        System.out.println("Is Adult? " + s3.isAdult());
        System.out.println();
    }
}