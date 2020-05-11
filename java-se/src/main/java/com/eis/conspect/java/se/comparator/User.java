package com.eis.conspect.java.se.comparator;

public class User implements Comparable {

    int age;
    String name;
    double grade;

    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (this.getAge() > ((User) o).getAge()) {
            return -1;
        } else if (this.getAge() < ((User) o).getAge()) {
            return 1;
        } else {
            return 0;
        }
    }
}
