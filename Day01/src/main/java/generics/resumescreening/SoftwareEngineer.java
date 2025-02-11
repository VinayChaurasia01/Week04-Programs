package generics.resumescreening;

// Represents a job role for a Software Engineer
public class SoftwareEngineer extends JobRole {

    // Constructor to initialize candidate details
    public SoftwareEngineer(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    // Overriding requiredSkills() to specify Software Engineer skills
    @Override
    public String requiredSkills() {
        return "Required Skills: Java, Python, Data Structures, Algorithms";
    }
}
