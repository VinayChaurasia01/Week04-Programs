package generics.universitycourse;

// Main class to test university course management
public class UniversityCourseManagement {
    public static void main(String[] args) {
        // Creating course catalog
        CourseCatalog catalog = new CourseCatalog();

        // Creating different types of courses
        Course<ExamCourse> scienceCourse = new Course<>(new ExamCourse("Science", "Mr. Aloney", 60));
        Course<AssignmentCourse> computerCourse = new Course<>(new AssignmentCourse("Computer Science", "Prof Rajesh Bhogey", 4));
        Course<ResearchCourse> aiCourse = new Course<>(new ResearchCourse("Artificial Intelligence", "Prof Anjali Tiwari", "Deep Learning"));

        // Adding courses to catalog
        catalog.addCourse(scienceCourse);
        catalog.addCourse(computerCourse);
        catalog.addCourse(aiCourse);

        // Displaying all courses
        catalog.displayCourses();
    }
}

