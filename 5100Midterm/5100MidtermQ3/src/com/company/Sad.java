package com.company;

public abstract class Sad extends Moody{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMood(){
        System.out.println("sad");
        return null;
    }

    public String ExpressFeelings(String cryingString){
        System.out.println("waah" + "boo hoo" + "weep" + "sob");
        return cryingString;
    }

    public String toString(String cryingString){
        System.out.println("Subject cries a lot");
        return cryingString;
    }
}
