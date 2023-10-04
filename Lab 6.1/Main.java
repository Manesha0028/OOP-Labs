import shapes.Circle;
import shapes.Rectangle;

public class Main {
        public static void main(String[] args) {
            // Create instances of Circle and Rectangle
            Circle circle = new Circle(7.0);
            Rectangle rectangle = new Rectangle(4.0, 6.0);

            // Calculate and print the area and perimeter for each shape
            System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());
            System.out.println("Rectangle - Area: " + rectangle.calculateArea() + ", Perimeter: " + rectangle.calculatePerimeter());
        }
    }


