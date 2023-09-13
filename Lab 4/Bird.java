
class Bird extends Animal {
    private double wingSpan;

    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }

    // Task 3: Method Overriding
    @Override
    public void makeSound() {
        System.out.println("Bird makes a bird-specific sound");
    }

    // Task 5: Override the toString() method
    @Override
    public String toString() {
        return super.toString() + ", wingSpan=" + wingSpan;
    }
}