package generics.resumescreening;

public class AIResumeScreening {
    public static void main(String[] args) {
        // Creating resume processor
        ResumeProcessor processor = new ResumeProcessor();

        // Creating different resumes
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Alice", 5));
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bob", 3));
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Charlie", 7));
        Resume<SoftwareEngineer> fresherResume = new Resume<>(new SoftwareEngineer("David", 0)); // Should be rejected

        // Adding resumes to the processor
        processor.addResume(seResume);
        processor.addResume(dsResume);
        processor.addResume(pmResume);
        processor.addResume(fresherResume);

        // Displaying valid resumes
        processor.displayResumes();
    }
}
