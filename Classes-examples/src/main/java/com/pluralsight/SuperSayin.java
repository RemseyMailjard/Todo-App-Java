package com.pluralsight;

public class SuperSaiyan {

    String name;
    int basePowerLevel;
    int currentPowerLevel;
    int transformationStage; // 0 = Base, 1 = SSJ1, 2 = SSJ2, 3 = SSJ3, 4 = SSJ God, etc.

    public SuperSaiyan(String name, int basePowerLevel) {
        this.name = name;
        this.basePowerLevel = basePowerLevel;
        this.currentPowerLevel = basePowerLevel;
        this.transformationStage = 0;
    }

    // Transformation multipliers inspired by DBZ lore
    private int getMultiplier() {
        switch (transformationStage) {
            case 1: return 50;   // Super Saiyan 1 ~50x base
            case 2: return 100;  // Super Saiyan 2 ~100x base
            case 3: return 400;  // Super Saiyan 3 ~400x base
            case 4: return 3000; // Super Saiyan God (approximation)
            case 5: return 20000;// Super Saiyan Blue / Ultra Instinct (fan exaggeration)
            default: return 1;   // Base form
        }
    }

    public void Transform(int stage) {
        if(stage > transformationStage) {
            transformationStage = stage;
            currentPowerLevel = basePowerLevel * getMultiplier();
            System.out.println(name + " has transformed into " + getFormName() + "!");
        } else {
            System.out.println(name + " cannot downgrade or repeat the same transformation.");
        }
    }

    private String getFormName() {
        switch (transformationStage) {
            case 1: return "Super Saiyan";
            case 2: return "Super Saiyan 2";
            case 3: return "Super Saiyan 3";
            case 4: return "Super Saiyan God";
            case 5: return "Ultra Instinct";
            default: return "Base Form";
        }
    }

    public void PowerUp() {
        currentPowerLevel *= 2;
        System.out.println(name + " powers up! Current power: " + currentPowerLevel);
        if(currentPowerLevel > 9000) {
            System.out.println("Vegeta shouts: IT'S OVER 9000!!!");
        }
    }

    public void Attack(SuperSaiyan opponent) {
        int damage = 100 * transformationStage; // higher forms deal more damage
        opponent.currentPowerLevel -= damage;
        System.out.println(name + " attacks " + opponent.name + " for " + damage + " damage!");
    }

    public void Heal() {
        currentPowerLevel += 500;
        System.out.println(name + " heals and regains strength. Current power: " + currentPowerLevel);
    }

    public void Stats() {
        System.out.println("=== " + name + " ===");
        System.out.println("Form: " + getFormName());
        System.out.println("Power Level: " + currentPowerLevel);
    }
}