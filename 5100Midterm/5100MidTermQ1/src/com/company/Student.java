package com.company;

public class Student {
    private String name;
    private int id;
    private int gpa;

    public Student() {
        name = "student1";
        id = 0;
        gpa = 4;
    }

    public Student(Student student) {
        Student student1 = new Student();
        this.name = student.name;
        this.id = student.id;
        this.gpa = student.gpa;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public int getGpa() {return gpa;}
    public void setGpa(int gpa) {this.gpa = gpa;}
}