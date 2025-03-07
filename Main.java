//Name:Prisha Jaiswal
//Prn: 23070126095
//Batch AIML B1
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nSelect a shape to calculate Area and Volume:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 7) break;

            Shape shape = null;
            Volume volumeShape = null;

            switch (choice) {
                case 1: // Circle
                    System.out.print("Enter radius: ");
                    shape = new Circle(scanner.nextDouble());
                    break;
                case 2: // Rectangle
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    shape = new Rectangle(length, scanner.nextDouble());
                    break;
                case 3: // Square
                    System.out.print("Enter side: ");
                    shape = new Square(scanner.nextDouble());
                    break;
                case 4: // Sphere
                    System.out.print("Enter radius: ");
                    Sphere sphere = new Sphere(scanner.nextDouble());
                    shape = sphere;
                    volumeShape = sphere;
                    break;
                case 5: // Cylinder
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    Cylinder cylinder = new Cylinder(radius, scanner.nextDouble());
                    shape = cylinder;
                    volumeShape = cylinder;
                    break;
                case 6: // Equilateral Pyramid
                    System.out.print("Enter base length: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    EquilateralPyramid pyramid = new EquilateralPyramid(base, scanner.nextDouble());
                    shape = pyramid;
                    volumeShape = pyramid;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }
            
            System.out.println("\nShape Details:");
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            if (volumeShape != null) {
                System.out.println("Volume: " + volumeShape.calculateVolume());
            }
        }
        scanner.close();
    }
}
