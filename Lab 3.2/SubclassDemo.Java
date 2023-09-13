class SubclassDemo extends AccessModifiersDemo {
    // Implementing a method in the subclass
    public void displayProtectedVar() {
        boolean value = getProtectedVar(); // Calling the protected method from the superclass
        System.out.println("ProtectedVar in SubclassDemo: " + value);
    }
}