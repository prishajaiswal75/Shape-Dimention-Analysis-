Shape Calculation Program

Description

This Java program provides a menu-driven system to calculate the area, perimeter, and volume of various geometric shapes. It utilizes an abstract class Shape for 2D and 3D shapes and an interface Volume for volume calculations in 3D shapes.

Features

Supports different shapes: Circle, Rectangle, Square, Sphere, Cylinder, Cuboid, and Equilateral Pyramid.

Uses abstraction (Shape class) to enforce area and perimeter calculations.

Implements interface (Volume) for 3D shapes that require volume calculations.

A menu-driven system allows users to input dimensions and retrieve calculations interactively.

Files and Structure

1. Shape.java

Abstract class defining the base structure for all shapes.

Contains protected attributes dim_one, dim_two, dim_three, and num_sides.

Declares abstract methods calculateArea() and calculatePerimeter().

2. Volume.java

Interface containing calculateVolume() for 3D shapes.

3. Circle.java

Subclass of Shape representing a circle.

Implements calculateArea() and calculatePerimeter().

4. Rectangle.java

Subclass of Shape representing a rectangle.

Implements calculateArea() and calculatePerimeter().

5. Square.java

Subclass of Shape representing a square.

Implements calculateArea() and calculatePerimeter().

6. Sphere.java

Subclass of Shape implementing Volume.

Implements calculateArea(), and calculateVolume().

7. Cylinder.java

Subclass of Shape implementing Volume.

Implements calculateArea(), calculatePerimeter(), and calculateVolume().

8. Cuboid.java

Subclass of Shape implementing Volume.

Implements calculateArea(), calculatePerimeter(), and calculateVolume().

9. EquilateralPyramid.java

Subclass of Shape implementing Volume.

Implements calculateArea(), calculatePerimeter(), and calculateVolume().

10. Main.java

Provides a menu-driven interface.

Allows users to select a shape and input dimensions.

Calls appropriate methods to calculate and display area, perimeter, and volume.
