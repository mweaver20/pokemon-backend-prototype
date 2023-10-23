package com.example.registrationlogindemo.entity.characters;

//create instances of all playable pokemon here

//

public class Pokemon {
    private Pokemon pikachu;

    //instanctate instances of all playable characters apon construction
    public Pokemon(){
        this.pikachu = new Pikachu();
    }

    //create getters for all characters
    public Pokemon getPikachu() {
        return pikachu;
    }



}
