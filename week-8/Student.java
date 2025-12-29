package week8;

public class Student {
    int studentId;
    String name;
    int age;
    double grade;

    // Constructor(overloading)
    Student(String name) {
        this.name = name;
    }

    // Constructor with attribute
    Student(String name, int studentId, int age, double grade) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade: " + grade);
        System.out.println("----------------------");
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Iyush Basnet");

        Student s2 = new Student("Ram", 123, 12, 2.6);
        s2.displayInfo();
        System.out.println("Student is Adult: " + s2.isAdult());
        System.out.println();

        Student s3 = new Student("Iyush", 111, 16, 3.9);
        s3.displayInfo();
        System.out.println("Student is Adult: " + s3.isAdult());
    }
}