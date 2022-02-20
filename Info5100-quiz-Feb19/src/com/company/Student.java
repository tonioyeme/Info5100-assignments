package com.company;

public class Student extends Person{
    public Student(String name, Integer id, Integer age) {
        super(name, id, age);
    }

    public String takeQuiz(){
        return "take quiz.";
    }
}
