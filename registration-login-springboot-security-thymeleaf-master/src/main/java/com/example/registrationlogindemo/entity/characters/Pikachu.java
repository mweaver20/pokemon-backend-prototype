package com.example.registrationlogindemo.entity.characters;
import com.example.registrationlogindemo.entity.battle.Attack;
import com.example.registrationlogindemo.entity.battle.Evolution;
public class Pikachu extends Pokemon{



    //define all pickachu stats here
    private int eveloutionStat = 1;
    private Attack evol1LowRiskAttack = new Attack(5,3);
    private Attack evol1HightRiskAttack = new Attack(8,8);

    private Attack evol2LowRiskAttack = new Attack(6,5);
    private Attack evol2HighRiskAttack = new Attack(10,7);

    private Evolution evolution1 = new Evolution(1, evol1LowRiskAttack, evol1HightRiskAttack);
    private Evolution evolution2 = new Evolution(2, evol2LowRiskAttack,evol2HighRiskAttack);


    public Pikachu() {

    }

    public int getEveloutionStat() {
        return eveloutionStat;
    }

    public void setEveloutionStat(int eveloutionStat) {
        this.eveloutionStat = eveloutionStat;
    }

    public Attack getEvol1LowRiskAttack() {
        return evol1LowRiskAttack;
    }

    public void setEvol1LowRiskAttack(Attack evol1LowRiskAttack) {
        this.evol1LowRiskAttack = evol1LowRiskAttack;
    }

    public Attack getEvol1HightRiskAttack() {
        return evol1HightRiskAttack;
    }

    public void setEvol1HightRiskAttack(Attack evol1HightRiskAttack) {
        this.evol1HightRiskAttack = evol1HightRiskAttack;
    }

    public Attack getEvol2LowRiskAttack() {
        return evol2LowRiskAttack;
    }

    public void setEvol2LowRiskAttack(Attack evol2LowRiskAttack) {
        this.evol2LowRiskAttack = evol2LowRiskAttack;
    }

    public Attack getEvol2HighRiskAttack() {
        return evol2HighRiskAttack;
    }

    public void setEvol2HighRiskAttack(Attack evol2HighRiskAttack) {
        this.evol2HighRiskAttack = evol2HighRiskAttack;
    }

    public Evolution getEvolution1() {
        return evolution1;
    }

    public void setEvolution1(Evolution evolution1) {
        this.evolution1 = evolution1;
    }

    public Evolution getEvolution2() {
        return evolution2;
    }

    public void setEvolution2(Evolution evolution2) {
        this.evolution2 = evolution2;
    }






}
