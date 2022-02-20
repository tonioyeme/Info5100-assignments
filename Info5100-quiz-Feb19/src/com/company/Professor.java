package com.company;

public class Professor extends Person{


    public Professor(String name, Integer id, Integer age) {
        super(name, id, age);
    }

    public String giveQuiz(){
        return "give quiz.";
    }
}
