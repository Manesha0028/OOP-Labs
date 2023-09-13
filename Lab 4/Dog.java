
class Dog extends Mammal {
    private String breed;

    public Dog(String name, int age, String furColor, String breed) {
        super(name, age, furColor);
        this.breed = breed;
    }

    // Task 5: Override the toString() method
    @Override
    public String toString() {
        return super.toString() + ", breed=" + breed;
    }
}