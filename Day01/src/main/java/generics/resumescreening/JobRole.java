package generics.resumescreening;

// Abstract class representing a generic job role
public abstract class JobRole {
    private String candidateName;
    private int experienceYears;

    // Constructor to initialize candidate details
    public JobRole(String candidateName, int experienceYears) {
        this.candidateName = candidateName;
        this.experienceYears = experienceYears;
    }

    // Getter methods
    public String getCandidateName() {
        return candidateName;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    // Abstract method to be implemented by subclasses
    public abstract String requiredSkills();

    // Overriding toString() to display candidate details
    @Override
    public String toString() {
        return candidateName + " - " + experienceYears + " years of experience";
    }
}
