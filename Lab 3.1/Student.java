class Student {
    private String name;
    private int age;
    private char grade;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String newName) {
        name = newName;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int newAge) {
        age = newAge;
    }

    // Getter for grade
    public char getGrade() {
        return grade;
    }

    // Setter for grade
    public void setGrade(char newGrade) {
        grade = newGrade;
    }

    // Display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}