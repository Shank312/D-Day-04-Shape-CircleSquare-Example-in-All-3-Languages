
'''
shape will have:

A constructor

An area() method (overridden) -->

Shape (Base Class)
|— Circle
|— Square


Concepts used -->

Inheritance

Method Overriding

Polymorphism via Duck Typing

Constructor using __init__

'''

import math

class Shape:
    def area(self):
        return 0
    
class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return math.pi*self.radius*self.radius
    
class Square(Shape):
    def __init__(self, side):
        self.side = side

    def area(self):
        return self.side*self.side
    
# Usage
shapes = [Circle(5), Square(4)]

for shape in shapes:
    print(f"Area: {shape.area()}")

