package com.company;

public class Main {

    public static void main(String[] args) {

        SeattlePoliceDepartment seattlePoliceDepartment = new SeattlePoliceDepartment();

        Person p1 = new Person("p1", 10);
        Person p2 = new Person("p2", 20);
        Person p3 = new Person("p3", 30);
        Person p4 = new Person("p4", 40);

        p1.subscribe(seattlePoliceDepartment);
        p2.subscribe(seattlePoliceDepartment);
        p3.subscribe(seattlePoliceDepartment);
        p4.subscribe(seattlePoliceDepartment);

        seattlePoliceDepartment.NotifyCitizens("Please be safe!");

        p3.unSubscribe(seattlePoliceDepartment);
        p4.unSubscribe(seattlePoliceDepartment);

        seattlePoliceDepartment.NotifyCitizens("Please be safe!");

    }
}
