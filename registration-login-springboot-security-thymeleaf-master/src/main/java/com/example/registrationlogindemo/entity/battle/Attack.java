package com.example.registrationlogindemo.entity.battle;

public class Attack {
    public Attack(int opponentDamage, int playerDamage){
        this.opponentDamage = opponentDamage;
        this.playerDamage = playerDamage;
    }
    public int getOpponentDamage() {
        return opponentDamage;
    }

    public void setOpponentDamage(int opponentDamage) {
        this.opponentDamage = opponentDamage;
    }

    public int getPlayerDamage() {
        return playerDamage;
    }

    public void setPlayerDamage(int playerDamage) {
        this.playerDamage = playerDamage;
    }

    private int opponentDamage, playerDamage;


}
