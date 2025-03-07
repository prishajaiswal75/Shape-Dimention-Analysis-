class Rectangle extends Shape {
    
    // Constructor
    public Rectangle(double length, double width) {
        super(length, width, 0, 4);  // dim_three is unused, so we pass 0
    }


    public double calculateArea() {
        return dim_one * dim_two; // Length * Width
    }


    public double calculatePerimeter() {
        return 2 * (dim_one + dim_two); // 2 * (Length + Width)
    }
}
