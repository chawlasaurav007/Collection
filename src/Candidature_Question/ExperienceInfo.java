package Candidature_Question;

public class ExperienceInfo {
    int years;
    String company;
    String technology;

    public ExperienceInfo(int years, String company, String technology) {
        this.years = years;
        this.company = company;
        this.technology = technology;
    }

    @Override
    public String toString() {
        return "Experience : " + years + " Years" +
                "\nCompany : " + company +
                "\nTechnology : " + technology;
    }
}
