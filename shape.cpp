
/*
 shape will have:

A constructor

An area() method (overridden) -->

Shape (Base Class)
|— Circle
|— Square


Concepts used -->
Virtual functions for polymorphism

Pointers to base class (Shape*)

Manual memory management (new, delete)

Overriding using override
*/

#include <iostream>
#include <cmath>
using namespace std;

class Shape {
    public:
        virtual double area() {
            return 0;
        }
};

class Circle : public Shape {
    double radius;
public:
    Circle(double r) {
        radius = r;
    }
    
    double area() override {
        return M_PI*radius*radius;
    }
};

class Square : public Shape {
    double side;
public:
    Square(double s) {
        side = s;
    }

    double area() override {
        return side*side;
    }
};

int main() {
    Shape* shapes[2];
    shapes[0] = new Circle(5);
    shapes[1] = new Square(4);

    for (int i = 0; i < 2; i++) {
        cout << "Area: " << shapes[i]->area() << endl;
    }

    return 0;
}