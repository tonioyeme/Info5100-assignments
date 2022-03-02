package com.company;

public class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void getNotified(SeattlePoliceDepartment seattlePoliceDepartment){

    }

    public void subscribe(SeattlePoliceDepartment seattlePoliceDepartment){
        if( ! seattlePoliceDepartment.person.contains(this)){
            seattlePoliceDepartment.person.add(this);
        }
    }

    public void unSubscribe(SeattlePoliceDepartment seattlePoliceDepartment){
        seattlePoliceDepartment.person.remove(this);
    }
}
