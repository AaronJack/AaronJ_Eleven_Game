package com.company;

public class Card {

    private String suit;
    private String rank;
    private int value;

    public Card(String suit, String rank, int value){
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }

    public String suit(){
        return suit;
    }

    public String rank(){
        return rank;
    }

    public int value(){
        return value;
    }

    public boolean equals(Card param){
        if(this.rank.equals(param.rank)){

        }
        return false;
    }

}
