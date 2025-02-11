package generics.resumescreening;

// Represents a job role for a Product Manager
public class ProductManager extends JobRole {

    // Constructor to initialize candidate details
    public ProductManager(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    // Overriding requiredSkills() to specify Product Manager skills
    @Override
    public String requiredSkills() {
        return "Required Skills: Market Research, Agile, UX, Business Strategy";
    }
}
