package generics.resumescreening;

// Represents a job role for a Data Scientist
public class DataScientist extends JobRole {

    // Constructor to initialize candidate details
    public DataScientist(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    // Overriding requiredSkills() to specify Data Scientist skills
    @Override
    public String requiredSkills() {
        return "Required Skills: Python, SQL, Machine Learning, Statistics";
    }
}
