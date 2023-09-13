public class Main {
    public static void main(String[] args) {
        // Inside the main method, create an instance of the AccessModifiersDemo class.
        AccessModifiersDemo demo = new AccessModifiersDemo();

        // Access and print the values of all variables using their respective getter methods.
        System.out.println("PrivateVar: " + demo.getPrivateVar());
        System.out.println("DefaultVar: " + demo.getDefaultVar());
        System.out.println("ProtectedVar: " + demo.getProtectedVar());
        System.out.println("PublicVar: " + demo.getPublicVar());

        // Task 5: Test Subclass Access
        // Inside the main method, create an instance of the SubclassDemo class.
        SubclassDemo subDemo = new SubclassDemo();

        // Use the instance to call the displayProtectedVar() method.
        subDemo.displayProtectedVar();
    }
}
