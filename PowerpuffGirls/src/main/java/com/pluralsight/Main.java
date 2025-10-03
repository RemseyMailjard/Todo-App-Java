package com.pluralsight;

import java.lang.Character;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    // Todo: A PowerPuff fighting game
        // Features
        // Play online, play solo

        // Customizing Characters
        // Customes
        // Finishing Moves
        // Team attack
        // Dialogue
        // Health boost

        PowerpullGirl blossom = new PowerpullGirl("Blossom", "pink");
        System.out.println(blossom.getHealth());
        blossom.setHealth(2044);
        blossom.Attack(200);
        blossom.Attack(1000, "Super attack");
    }

}
