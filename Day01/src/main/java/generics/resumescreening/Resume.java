package generics.resumescreening;

// Generic Resume class that works for any JobRole
public class Resume<T extends JobRole> {
    private T jobRole;

    // Constructor to initialize a resume with a job role
    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    // Getter method for job role
    public T getJobRole() {
        return jobRole;
    }

    // Overriding toString() to display resume details
    @Override
    public String toString() {
        return "Resume of " + jobRole.getCandidateName() + " for " + jobRole.getClass().getSimpleName() + "\n" + jobRole.requiredSkills();
    }
}
