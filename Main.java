
/*
 shape will have:

A constructor

An area() method (overridden) -->

Shape (Base Class)
|— Circle
|— Square


Concepts used -->
Abstract class and method

Inheritance using extends

Polymorphism via upcasting Shape[]

Method overriding with same signature
 */

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI*radius*radius;
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    double area() {
        return side*side;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(5), new Square(4)};

        for (Shape s : shapes) {
            System.out.println("Area: " + s.area());
        }
    }
}