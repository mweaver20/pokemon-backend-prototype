package com.example.registrationlogindemo.entity;

import com.example.registrationlogindemo.entity.characters.Pikachu;
import com.example.registrationlogindemo.entity.characters.Pokemon;

public class Player {

    //username, character, HP, level
    private String username; //get username from user entity

    public Pokemon pokemon ; //String data type is temporary and will be replaced with pokemon or character object after class is created
    public int level = 0; //all new players are automatically level 1 which is index 0 of level array

    public int HP = 100;//all new players have 100 HP

    //defualt constructor
    public Player() {

    }

    //constructor with players username and choosen character(pokemon)
    public Player(String username) {
        //setting default character to play as pikachu
        this.pokemon = new Pikachu();
        this.username = username;
    }

    //getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }
    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
