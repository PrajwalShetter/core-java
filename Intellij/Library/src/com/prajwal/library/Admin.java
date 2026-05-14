package com.prajwal.library;

public class Admin {
    private String name ;
    private int age;
    private int salary;
    private double experience ;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Name :"+ name + " age :"+ age + "salary :"+salary + "experience:"+ experience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getExperience() {
        return experience;
    }

    public int getSalary() {
        return salary;
    }
}
