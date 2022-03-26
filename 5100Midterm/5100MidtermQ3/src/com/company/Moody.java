package com.company;

public abstract class Moody {
    abstract String getMood();
    abstract String ExpressFeelings();
    public Moody() {
    }

    public void queryMood(){
        System.out.println("I feel " + getMood() + " today!!");
    }
}

