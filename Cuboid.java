class Cuboid extends Shape implements Volume {
    
    public Cuboid(double length, double width, double height) {
        super(length, width, height, 12);
    }

    public double calculateArea() {
        return 2 * (dim_one * dim_two + dim_one * dim_three + dim_two * dim_three);
    }

    public double calculatePerimeter() {
        return 4 * (dim_one + dim_two + dim_three);
    }

    public double calculateVolume() {
        return dim_one * dim_two * dim_three;
    }
}
