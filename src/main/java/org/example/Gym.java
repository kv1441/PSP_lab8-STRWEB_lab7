package org.example;

public class Gym {
    private String name;
    private int age;
    private String gender;
    private String membership;

    public Gym() {}

    public Gym(String name, int age, String gender, String membership) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.membership = membership;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }
}
