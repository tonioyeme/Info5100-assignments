package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Player a = new Player("a", 97);
        Player b = new Player("b", 99);
        Player c = new Player("c", 98);

        Player[] players = {a,b,c};

        Arrays.sort(players, comparatorScore(true));

        printPlayers(players);

        //Comparator<Player> comparatorScore = (player1, player2) -> Integer.compare(player1.getScore(), player2.getScore());
    }

    private static void printPlayers(Player[] players){
        for (Player p: players){
            System.out.println(
                    p.getName() + "\t" + p.getScore()
            );
        }
    }

    private static Comparator<Player> comparatorScore(boolean highestFirst){
        if(highestFirst) {
            return (player1, player2) -> Integer.compare(player2.getScore(), player1.getScore());
        }
        return (player1, player2) -> Integer.compare(player1.getScore(), player2.getScore());
    }
}
