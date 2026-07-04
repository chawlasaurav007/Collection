package Candidature_Question;

public class PersonalInfo {
    String name;
    int age;
    String city;

    public PersonalInfo(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Name : " + name +
                "\nAge : " + age +
                "\nCity : " + city;
    }
}
