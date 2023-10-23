package com.example.registrationlogindemo.entity.battle;
import com.example.registrationlogindemo.entity.battle.Attack;
public class Evolution {
    private Attack attack1,attack2;
    private int evolution;

    public Evolution(int evolution, Attack attack1, Attack attack2){
        this.evolution = evolution;
        this.attack1 = attack1;
        this.attack2 = attack2;
    }
}
