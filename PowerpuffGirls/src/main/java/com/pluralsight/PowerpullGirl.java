package com.pluralsight;

/**
 * PowerpullGirl: simple domain model with health/power management.
 */
public class PowerpullGirl {


    // Cannot be changed

    // This is used inside of calculations //information for programmeurs to reuse
    private static final int MAX_HEALTH = 100;
    private static final int MIN_HEALTH = 0;
    private static final int MAX_POWER  = 100;
    private static final int MIN_POWER  = 0;

    public void Attack(int _power) {

    }

    public void Attack(int _power, String _message) {
        System.out.println(_message);
    }

    private final String name;
    private final String outfitColor;

    private int health;
    private int attackDamage;
    private int power;

    // Constructor with sensible defaults
    public PowerpullGirl(String name, String outfitColor) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null/blank");
        }
        if (outfitColor == null || outfitColor.isBlank()) {
            throw new IllegalArgumentException("outfitColor cannot be null/blank");
        }
        this.name = name.trim();
        this.outfitColor = outfitColor.trim();
        this.power = MAX_POWER;
        this.health = MAX_HEALTH;
        this.attackDamage = 100;
    }

    // --- Getters (no direct setters for identity fields) ---
    public String getName()        { return name; }
    public String getOutfitColor() { return outfitColor; }
    public int getHealth()         { return health; }
    public int getPower()          { return power; }
    public int getAttackDamage()   { return attackDamage; }

    // Controlled mutators
    public void setHealth(int newHealth) {
        this.health = clamp(newHealth, MIN_HEALTH, MAX_HEALTH);
    }

    public void setAttackDamage(int newAttackDamage) {
        if (newAttackDamage < 0) {
            throw new IllegalArgumentException("attackDamage cannot be negative");
        }
        this.attackDamage = newAttackDamage;
    }

    // Domain actions
    public void heal(int amount) {
        if (amount <= 0) return;
        setHealth(health + amount);
        if (health == MAX_HEALTH) {
            System.out.println("Fully recovered.");
        }
    }

    public void takeDamage(int amount) {
        if (amount <= 0) return;
        setHealth(health - amount);
        if (health <= 20) {
            System.out.println("Warning: Low health! Drink a potion.");
        }
    }

    public boolean usePower(int amount) {
        if (amount <= 0) return true;
        int next = power - amount;
        if (next < MIN_POWER) {
            System.out.println("Not enough power. Consider recharging.");
            return false;
        }
        power = next;
        if (power <= 20) {
            System.out.println("Power low — recharge soon.");
        }
        return true;
    }

    public void rechargePower(int amount) {
        if (amount <= 0) return;
        power = clamp(power + amount, MIN_POWER, MAX_POWER);
    }

    @Override
    public String toString() {
        return "PowerpullGirl{name='%s', outfitColor='%s', health=%d, power=%d, attackDamage=%d}"
                .formatted(name, outfitColor, health, power, attackDamage);
    }

    // Utility
    private static int clamp(int value, int min, int max) {
        return Math.max(min, Math.min(max, value));
    }
}
