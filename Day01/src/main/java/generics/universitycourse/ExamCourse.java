package generics.universitycourse;

// Represents a course with an exam component
public class ExamCourse extends CourseType {
    private int examWeightage;

    // Constructor to initialize exam course details
    public ExamCourse(String courseName, String instructor, int examWeightage) {
        super(courseName, instructor);
        this.examWeightage = examWeightage;
    }

    @Override
    public <T> T getCourseDetail() {
        // Returns exam weightage as a string
        return (T) ("Exam Weightage: " + examWeightage);
    }
}
