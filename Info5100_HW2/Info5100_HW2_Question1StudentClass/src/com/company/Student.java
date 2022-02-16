package com.company;

public class Student {
    int rollNumber;
    String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student(Student s1) {
        rollNumber = s1.rollNumber;
        name = s1.name;
    }

    public int printRoll() {
        return rollNumber;
    }

    public String printName() {
        return name;
    }
}
