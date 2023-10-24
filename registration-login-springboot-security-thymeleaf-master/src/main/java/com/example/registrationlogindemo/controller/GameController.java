package com.example.registrationlogindemo.controller;

import com.example.registrationlogindemo.entity.characters.Pokemon;
import com.example.registrationlogindemo.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GameController {

    @Autowired
    LevelService ls = new LevelService();
    String fakeUsername = "fakeUsername";


}
