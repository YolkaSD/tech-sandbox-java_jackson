package Objects;

public class PersonForTask3 {
    private String name;
    private int age;
    private String city;

    public PersonForTask3() {
    }

    public PersonForTask3(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "PersonForTask3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
