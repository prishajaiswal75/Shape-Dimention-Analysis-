//Circle.java
class Circle extends Shape {
    
    // Constructor
    public Circle(double radius) {
        super(radius, 0, 0, 0);  // Only one dimension is relevant
    }

    // Method to calculate area of the circle
    public double calculateArea() {
        return Math.PI * dim_one * dim_one; // π * r²
    }

    // Method to calculate perimeter (circumference)
    public double calculatePerimeter() {
        return 2 * Math.PI * dim_one; // 2πr
    }
}
