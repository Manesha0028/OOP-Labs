class Mammal extends Animal {
    private String furColor;

    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    // Task 3: Method Overriding
    @Override
    public void makeSound() {
        System.out.println("Mammal makes a mammal-specific sound");
    }

    // Task 5: Override the toString() method
    @Override
    public String toString() {
        return super.toString() + ", furColor=" + furColor;
    }
}
