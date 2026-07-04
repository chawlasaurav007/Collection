package Candidature_Question;

import java.util.HashMap;

public class Selecting_Candidate {
    public static void main(String[] args) {

        HashMap<String, Candidate> jobPortal = new HashMap<>();

        jobPortal.put("Rahul",
                new Candidate(
                        new PersonalInfo("Rahul", 25, "Indore"),
                        new EducationInfo("B.Tech", "RGPV", 78.5),
                        new ExperienceInfo(2, "TCS", "Java")
                ));

        jobPortal.put("Saurav",
                new Candidate(
                        new PersonalInfo("Saurav", 27, "Bangalore"),
                        new EducationInfo("B.Tech", "IIIT KOTA", 82),
                        new ExperienceInfo(3, "Infosys", "Spring Boot")
                ));

        jobPortal.put("Amit",
                new Candidate(
                        new PersonalInfo("Amit", 27, "Delhi"),
                        new EducationInfo("MCA", "DU", 80),
                        new ExperienceInfo(4, "Wipro", "Microservices")
                ));

        // Recruiter selects candidate by name

        String candidateName = "Saurav";

        Candidate candidate = jobPortal.get(candidateName);

        if (candidate != null) {
            System.out.println(candidate);
        } else {
            System.out.println("Candidate not found");
        }
    }
}
