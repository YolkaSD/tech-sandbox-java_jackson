package org.example;

public class User {
    private String name;
    private int grade;

    public User() {
    }

    public User(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
