public class Subject{
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Alice", "Computer Science", 3);

        // Register courses for the student
        student.registerCourse("Mathematics", 75);
        student.registerCourse("Physics", 38);
        student.registerCourse("Chemistry", 85);
        student.registerCourse("Programming", 65);

        // Retrieve student information
        student.displayStudentInfo();

        // Retrieve courses with marks less than 40
        student.displayLowMarksCourses();
    }
}