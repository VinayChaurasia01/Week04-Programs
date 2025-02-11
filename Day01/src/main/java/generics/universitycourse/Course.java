package generics.universitycourse;

// Generic Course class that holds a specific type of CourseType
public class Course<T extends CourseType> {
    private T courseType;

    // Constructor to initialize the course
    public Course(T courseType) {
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    @Override
    public String toString() {
        return "CourseType: " + courseType;
    }
}
