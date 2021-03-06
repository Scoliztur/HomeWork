package bohdan.homework.com.fighters.base;



public abstract class ArenaFighter {

    private String name;
    private int health;
    private int damage;
    private double defense;
    private int fullHP;
    private int fullDamage;

    public ArenaFighter(String name, int health, int damage, double defense) {
        this.name = name;
        this.health = health;
        this.fullHP = health;
        this.damage = damage;
        this.fullDamage = damage;
        this.defense = defense;
    }


//  Mazahist method

    public int takeDamage(int damage){
            return health -= damage - (damage * defense);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    protected int setHealth(int health) {
        return this.health += health;
    }

    public int setRegenHealth(int health) {
        try {
            return this.health = health;
        } catch (RuntimeException e) {
            return getFullHP();
        }
    }

    public int getDamage() {
        return damage;
    }

    public int getFullDamage() {
        return fullDamage;
    }

    public void setDamage(int damage) {
        this.damage += damage;
    }

    public int setReturnDamage(int damage) {
        try {
            return this.damage = damage;
        } catch (RuntimeException e) {
            return getFullDamage();
        }
    }

    public int getFullHP() {
        return fullHP;
    }

    public void setFullHP(int fullHP) {
        this.fullHP += fullHP;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense += defense;
    }

}
