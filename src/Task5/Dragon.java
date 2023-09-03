package Task5;

public class Dragon {
    private int health;
    private int damage;

    public Dragon() {
        this.health = 500;
        this.damage = 35;
    }

    public Dragon(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "\nDragon:" +
                "\nhealth = " + health +
                "\ndamage = " + damage;
    }
}
