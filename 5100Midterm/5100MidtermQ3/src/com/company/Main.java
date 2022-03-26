package com.company;

public class Main {

    public static void main(String[] args) {
        Moody moody1 = new Happy() {
            @Override
            public String ExpressFeelings() {
                return null;
            }
        };

        Moody moody2 = new Sad() {
            @Override
            public String ExpressFeelings() {
                return null;
            }
        };

        Psychiatrist psychiatrist1 = new Psychiatrist();
        psychiatrist1.examine(moody1);
        moody1.ExpressFeelings();
        psychiatrist1.examine(moody2);
        moody2.ExpressFeelings();

    }
}
