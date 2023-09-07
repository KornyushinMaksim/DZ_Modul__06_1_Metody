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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String destructionDragon(int valueDmgSquad) {
        String str = "";
        this.health -= valueDmgSquad;
        if (this.health > 0){
            str = "Отряд нанес урон "  + valueDmgSquad + ", дракон осталcя жив с остатком HP = " + this.health;
        } else {
            str = "Отряд нанес урон "  + valueDmgSquad + " ... дракон погиб, а отряд копейщиков победил! Ура!";
        }
        return str;
    }

    @Override
    public String toString() {
        return "\nDragon:" +
                "\nhealth = " + health +
                "\ndamage = " + damage;
    }
}
