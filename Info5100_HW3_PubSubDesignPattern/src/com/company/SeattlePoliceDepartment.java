package com.company;

import java.util.ArrayList;

public class SeattlePoliceDepartment {
    String notification;
    ArrayList<Person> person;

    public SeattlePoliceDepartment(){
        this.person = new ArrayList<>();
    }


    public void NotifyCitizens(String notification){
        this.notification = notification;
        for (Person person: person) {
            person.getNotified(this);
        }

    }
}
