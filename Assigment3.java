package Assigments;

class Student {

    String name;
    int age;
    String grade;

    Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void displayDetails() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class Assigment3 {

    public static void main(String[] args) {

        Student student1 = new Student("John Doe", 20, "A");
        student1.displayDetails();

    }
}
