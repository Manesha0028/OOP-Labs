public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Area rectangle = new Area();

       
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

  
        rectangle.setDim(length, breadth);

      
        double area = rectangle.getArea();
        System.out.println("Area of the rectangle with length " + length + " and breadth " + breadth + " is: " + area);

        scanner.close();
    }
}