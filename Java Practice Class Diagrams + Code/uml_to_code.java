
// -----------------------
// UML to Java Conversion
// -----------------------

// -----------------------
// Person -> Student
// -----------------------

// ```java

// -----------------------
// UML to Java Conversion
// -----------------------

// -----------------------
// Person -> Student
// -----------------------

// Base class: Person

class Person {
    private String name;              // Encapsulated name
    private int age;                  // Encapsulated age

    // Constructor to initialize Person attributes
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to return person's details
    public String getDetails() {
        return "Name: " + name + ", Age: " + age;
    }
}

// Subclass: Student extends Person
class Student extends Person {
    private int rollnumber;                             // Encapsulated rollnumber
    private String grade;                               // Encapsulated grade

    // Constructor to initialize Student attributes along with Person's
    public Student(String name, int age, int rollnumber, String grade) {
        super(name, age);                               // Call to superclass Constructor
        this.rollnumber = rollnumber;
        this.grade = grade;

    }

    // Overriding to getDetails to include student-specific info
    @Override
    public String getDetails() {
        return super.getDetails() + ", Roll No: " + rollnumber + ", Grade: " + grade;
    }
}

// ----------------------
// Shape (Abstract) -> Circle
// ----------------------

// Abstract class: Shape
abstract class Shape {
    protected String color;      // Protected color property accessible by subclass

    // Constructor to initialize color
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method to calculate area (to be implemented by subclass )
    public abstract double area();
}

// Subclass: Circle extends shape
class Circle extends Shape {
    private double radius;      // Encapsulated radius

    // Constructor to initialize radius and color via superclass
    public Circle(String color, double radius) {
        super(color);           // Call to Shape Constructor
        this.radius = radius;
    }

    // Implementation of abstract method area() for Circle
    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
}

// -----------------------
// Main Class to Test All
// -----------------------

public class uml_to_code {
    public static void main(String[] args) {
        
        // Create and test Student object
        Student s1 = new Student("Alice", 20, 101, "A");
        System.out.println(s1.getDetails());

        // Create and test Student object
        Circle c1 = new Circle("Red", 5.5);
        System.out.println("Circle Area: " + c1.area());
    }
}