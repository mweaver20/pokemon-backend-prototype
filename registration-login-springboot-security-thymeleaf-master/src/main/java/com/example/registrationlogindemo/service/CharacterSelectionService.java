package com.example.registrationlogindemo.service;

import com.example.registrationlogindemo.entity.characters.Pokemon;
import org.springframework.stereotype.Service;

@Service
public class CharacterSelectionService {

    public static void main(String[] args) {
        String chosenCharacter = chooseCharacter();
        System.out.println("You chose: " + chosenCharacter);
}
    public static String chooseCharacter() {
        Scanner scanner = new Scanner(System.in);
        String chosenCharacter = "";

        System.out.println("Choose your character: Charmander, Bulbasaur, Squirtle");
        String userInput = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison

        if (userInput.equals("charmander") || userInput.equals("bulbasaur") || userInput.equals("squirtle")) {
            chosenCharacter = userInput;
        } else {
            System.out.println("Invalid choice. Please choose one of the provided characters.");
            chosenCharacter = chooseCharacter(); // Recursive call to prompt again
        }

        scanner.close();
        return chosenCharacter;
    }
}


