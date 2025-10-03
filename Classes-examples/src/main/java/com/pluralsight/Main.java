package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        public class DBZBattle {
            public static void main(String[] args) {
                SuperSaiyan goku = new SuperSaiyan("Goku", 5000);
                SuperSaiyan vegeta = new SuperSaiyan("Vegeta", 4800);

                goku.Stats();
                vegeta.Stats();

                goku.Transform(1); // Goku goes Super Saiyan
                goku.Stats();

                vegeta.Transform(2); // Vegeta jumps to SSJ2
                vegeta.Stats();

                goku.Attack(vegeta);
                vegeta.Attack(goku);

                goku.Heal();
                goku.PowerUp();
                goku.Stats();
            }
        }
    }
