package com.company;


public abstract class Happy extends Moody {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getMood(){
        System.out.println("happy");
        return null;
    }

    public String ExpressFeelings(){
        System.out.println("heeehee" + "hahahah" + "HAHAHA!!");
        return null;
    }

    public String toString(String laughterString){
        System.out.println("Subject laughs a lot");
        return laughterString;
    }
}
