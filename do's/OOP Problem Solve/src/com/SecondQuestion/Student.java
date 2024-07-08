class Student {
    String name;
    int grade;
    String email;

    // Constructor
    public Student(String name, int grade, String email) {
        this.name = name;
        this.grade = grade;
        this.email = email;
    }

    // Method to print student details
    public void printDetails() {
        System.out.println(name + " " + grade + " " + email);
    }
    public static void main(String[] args) {
        // Create an array of Student objects of size 3
        Student[] students = new Student[3];

        // Create and assign Student objects to the array
        students[0] = new Student("Peter", 3, "peter@gmail.com");
        students[1] = new Student("John", 4, "john@gmail.com");
        students[2] = new Student("Lisa", 5, "lisa@gmail.com");

        // Loop through the array and print the details of each student
        for (Student student : students) {
            student.printDetails();
        }
    }
}


