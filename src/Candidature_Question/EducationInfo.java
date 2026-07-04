package Candidature_Question;

public class EducationInfo {
    String degree;
    String college;
    double percentage;

    public EducationInfo(String degree, String college, double percentage) {
        this.degree = degree;
        this.college = college;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Degree : " + degree +
                "\nCollege : " + college +
                "\nPercentage : " + percentage;
    }
}
