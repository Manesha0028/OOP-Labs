public class Main {
    public static void main(String[] args) {
        // Create an instance using the default constructor
        Student student1 = new Student();
        System.out.println("Student 1 Info:");
        student1.displayInfo();
        System.out.println();

        // Create an instance using the parameterized constructor
        Student student2 = new Student("John", 20, 'A');
        System.out.println("Student 2 Info:");
        student2.displayInfo();
        System.out.println();

        // Create an instance using the constructor with default grade 'N'
        Student student3 = new Student("Alice", 18);
        System.out.println("Student 3 Info:");
        student3.displayInfo();
    }
}