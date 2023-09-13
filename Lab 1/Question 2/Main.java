    public class Main {
        public static void main(String[] args) {
            
            Area rectangle = new Area();

            double length = 5;
            double breadth = 10;
            rectangle.setDim(length, breadth);
    
            double area = rectangle.getArea();
            System.out.println("Area of the rectangle with length " + length + " and breadth " + breadth + " is: " + area);
        }
    }
    

