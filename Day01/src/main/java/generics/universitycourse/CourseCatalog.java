package generics.universitycourse;

import java.util.ArrayList;
import java.util.List;

// Manages a list of courses
public class CourseCatalog {
    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    // Adds a new course to the catalog
    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    // Displays all courses in the catalog
    public void displayCourses() {
        System.out.println("List of Courses:");
        for (Course<? extends CourseType> course : courses) {
            System.out.println(course);
        }
    }
}
