package generics.universitycourse;

// Abstract class representing a generic course type
public abstract class CourseType {
    private String courseName;
    private String instructor;

    // Constructor to initialize course details
    public CourseType(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    // Abstract method to be implemented by subclasses
    public abstract <T> T getCourseDetail();

    @Override
    public String toString() {
        return "Course: " + courseName + "\nInstructor: " + instructor + "\nDetails: " + getCourseDetail();
    }
}
