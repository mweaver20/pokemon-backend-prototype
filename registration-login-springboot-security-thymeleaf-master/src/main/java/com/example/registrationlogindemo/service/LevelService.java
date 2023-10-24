package com.example.registrationlogindemo.service;

import com.example.registrationlogindemo.entity.Level;
import com.example.registrationlogindemo.entity.Player;
import com.example.registrationlogindemo.entity.battle.Attack;
import com.example.registrationlogindemo.entity.characters.Pikachu;
import com.example.registrationlogindemo.entity.characters.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LevelService {
    //create new player with username and chosen character
    @Autowired
    private PlayerService ps = new PlayerService();
    @Autowired
    private BattleServices bs = new BattleServices();

    public Level[] levels = new Level[4];

    //get attack option input from user

    public void playGame(String username) {

        //create levels
        levels[0] = new Level(1, "level1", "Caterpie", 12);
        levels[1] = new Level(2, "level2", "Eevee", 16);
        levels[2] = new Level(3, "Evolution", "Pidgey", 20);
        levels[3] = new Level(4, "Game Win", "Charizard", 20);

        //create player instance
        Player player =  ps.createPlayer(username);
        playLevels(levels, player);


    }

    //start level
    public void playLevels( Level[] levels, Player player) {

        int playerHP = player.getHP();

        //creating default attack option for testing
        Pikachu pikachu = new Pikachu();
        Attack attack = pikachu.getEvol1LowRiskAttack();

        while(playerHP > 1 ) {
            Level currentLevel = levels[player.getLevel()];

            while(currentLevel.getLevelNumber() < levels.length + 1) {
                int opponentHP = currentLevel.getOpponentHP();

                while (opponentHP > 1) {
                    int tempPlayerHP = playerHP;
                    int tempOpponentHP = opponentHP;
                    //get attack option from user here:

                    //commense attack
                    bs.battle(tempOpponentHP, tempPlayerHP, attack);
                    //upgrade opponent and player hp

                    currentLevel.setOpponentHP(tempOpponentHP);
                    player.setHP(tempPlayerHP);
                }
                System.out.println("opponent defeated");
                System.out.println("moving to level " + player.getLevel() + 1);
                player.setLevel( player.level + 1);
            }
            System.out.println("You have finished the game! Congratulations");
            System.out.println("Here is you final score!: " + player.getHP());


        }
        System.out.println("Player has died! :( game is ending");
        System.out.println("you died on level " + player.getLevel());

    }
}
