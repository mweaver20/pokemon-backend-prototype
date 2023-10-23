package com.example.registrationlogindemo.service;

import com.example.registrationlogindemo.entity.Level;
import com.example.registrationlogindemo.entity.Player;
import com.example.registrationlogindemo.entity.battle.Attack;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class BattleServices {



    //check if attack was successful
    public boolean roleTheDice() {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        if(randomNumber < 5) {
            return false;
        } else {
            return true;
        }
    }

    public void battle(int opponentHP, int playersHP, Attack attack) {
        while (opponentHP > 0 && playersHP > 0) {
            boolean successfulAttack = roleTheDice();
            if (successfulAttack) {
                opponentHP -= attack.getOpponentDamage();
                System.out.println("attack was successful, opponent took " + attack.getOpponentDamage() + " damage!");
                System.out.println("Oppoent HP: " + opponentHP);
                System.out.println("Player HP: " + playersHP);
            } else {
                playersHP -= attack.getPlayerDamage();
                System.out.println("attack was unsuccessful, your pokemon took " + attack.getPlayerDamage() + " damage!");
                System.out.println("Oppoent HP: " + opponentHP);
                System.out.println("Player HP: " + playersHP);
            }
        }
    }


}
