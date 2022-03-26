package com.company;

public class Psychiatrist {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void examine(Moody moody){
        System.out.println("How are you feeling today?");
    }

    public void observe(Moody moody){
    }

    public String toString(){
        return this.getName();
    }
}
