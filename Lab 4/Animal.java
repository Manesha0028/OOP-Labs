class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Task 3: Method Overriding
    public void makeSound() {
        System.out.println("Animal makes a generic sound");
    }

    // Task 5: Override the toString() method
    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + "]";
    }
}

// Task 2: Creating Sub Classes to Implement Inheritance Hierarchy

