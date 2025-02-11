package generics.universitycourse;

// Represents a course focused on research
public class ResearchCourse extends CourseType {
    private String researchField;

    // Constructor to initialize research course details
    public ResearchCourse(String courseName, String instructor, String researchField) {
        super(courseName, instructor);
        this.researchField = researchField;
    }

    @Override
    public <T> T getCourseDetail() {
        // Returns research field as a string
        return (T) ("Research Field: " + researchField);
    }
}
