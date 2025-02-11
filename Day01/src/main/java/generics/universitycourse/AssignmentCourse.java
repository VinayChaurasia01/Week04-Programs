package generics.universitycourse;

// Represents a course type that involves assignments
public class AssignmentCourse extends CourseType {
    public int totalAssignments;

    // Constructor to initialize assignment course details
    public AssignmentCourse(String courseName, String instructor, int totalAssignments) {
        super(courseName, instructor);
        this.totalAssignments = totalAssignments;
    }

    @Override
    public <T> T getCourseDetail() {
        // Returns total assignments as a string
        return (T) ("Total Assignments: " + totalAssignments);
    }
}
