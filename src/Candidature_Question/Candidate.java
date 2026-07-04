package Candidature_Question;

public class Candidate {
    PersonalInfo personalInfo;
    EducationInfo educationInfo;
    ExperienceInfo experienceInfo;

    public Candidate(PersonalInfo personalInfo,
                     EducationInfo educationInfo,
                     ExperienceInfo experienceInfo) {

        this.personalInfo = personalInfo;
        this.educationInfo = educationInfo;
        this.experienceInfo = experienceInfo;
    }

    @Override
    public String toString() {

        return "------ Personal Information ------\n"
                + personalInfo

                + "\n\n------ Educational Information ------\n"
                + educationInfo

                + "\n\n------ Experience Information ------\n"
                + experienceInfo;
    }

}
