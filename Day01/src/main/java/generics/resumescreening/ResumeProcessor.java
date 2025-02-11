package generics.resumescreening;

import java.util.ArrayList;
import java.util.List;

// Class to process resumes and validate experience
public class ResumeProcessor {
    private List<Resume<? extends JobRole>> resumeList = new ArrayList<>();

    // Adds a resume to the list if it meets experience criteria
    public void addResume(Resume<? extends JobRole> resume) {
        if (validateResume(resume)) {
            resumeList.add(resume);
        } else {
            System.out.println("Invalid resume: " + resume);
        }
    }

    // Generic method for validating resumes (minimum 1 year experience)
    public <T extends JobRole> boolean validateResume(Resume<T> resume) {
        return resume.getJobRole().getExperienceYears() >= 1;
    }

    // Displays all processed resumes
    public void displayResumes() {
        System.out.println("Processed Resumes:");
        for (Resume<? extends JobRole> resume : resumeList) {
            System.out.println(resume);
        }
    }
}
