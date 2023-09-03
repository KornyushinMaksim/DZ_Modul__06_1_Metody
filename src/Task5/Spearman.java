package Task5;

public class Spearman {
    private int health;

    private int damage;

    private Boolean lifeSpearman;


    public Spearman() {
        this.health = 10;
        this.damage = 10;
        this.lifeSpearman = true;
    }

    public Spearman(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.lifeSpearman = true;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setLifeSpearman(boolean lifeSpearman) {
        this.lifeSpearman = lifeSpearman;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public boolean getLifeSpearman() {
        return lifeSpearman;
    }

    @Override
    public String toString() {
        return "\nSpearman:" +
                "\nhealth = " + health +
                "\ndamage = " + damage +
                "\n" + lifeSpearman;
    }
}
