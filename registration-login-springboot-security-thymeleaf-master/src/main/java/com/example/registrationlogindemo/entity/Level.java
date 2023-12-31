package com.example.registrationlogindemo.entity;

public class Level {
    private int levelNumber;
    private String levelTitle;
    private String opponent;
    private int opponentHP;

    // Constructors, getters, and setters

    public Level() {
        // Default constructor
    }

    public Level(int levelNumber, String levelTitle, String opponent, int opponentHP) {
        this.levelNumber = levelNumber;
        this.levelTitle = levelTitle;
        this.opponent = opponent;
        this.opponentHP = opponentHP;
    }

    // Getters and setters

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public String getLevelTitle() {
        return levelTitle;
    }

    public void setLevelTitle(String levelTitle) {
        this.levelTitle = levelTitle;
    }

    public String getOpponent() {
        return opponent;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    public int getOpponentHP() {
        return opponentHP;
    }

    public void setOpponentHP(int opponentHP) {
        this.opponentHP = opponentHP;
    }

}
