import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private int marks;

    public Course(String courseName, int marks) {
        this.courseName = courseName;
        this.marks = marks;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMarks() {
        return marks;
    }
}

class Student {
    private String name;
    private String program;
    private int semester;
    private List<Course> courses;

    public Student(String name, String program, int semester) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = new ArrayList<>();
    }

    public void registerCourse(String courseName, int marks) {
        Course course = new Course(courseName, marks);
        courses.add(course);
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Courses Registered:");
        for (Course course : courses) {
            System.out.println("Course: " + course.getCourseName());
        }
    }

    public void displayLowMarksCourses() {
        System.out.println("Courses with Marks Less than 40:");
        for (Course course : courses) {
            if (course.getMarks() < 40) {
                System.out.println("Course: " + course.getCourseName() + ", Marks: " + course.getMarks());
            }
        }
    }
}

