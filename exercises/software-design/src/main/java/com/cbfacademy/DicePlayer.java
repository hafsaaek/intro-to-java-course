package com.cbfacademy;

public class DicePlayer implements Player{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int roll() {
        int score = (int) (Math.random() * 6) + 1; // give a value between 0 & 6 (6 not included so 0 & 5) and add 1 = between 1 & 6!
        
        System.out.println(name + " rolled a " + score);

        return score;
    }
}

