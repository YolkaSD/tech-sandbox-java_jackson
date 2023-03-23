package Objects.forTask5;

public class Person {
    private String name;
    private int age;
    private Address address;
    private PhoneNumber[] phoneNumbers;

    public Person() {
    }

    public Person(String name, int age, Address address, PhoneNumber[] phoneNumbers) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public PhoneNumber[] getPhoneNumbers() {
        return phoneNumbers;
    }
}
