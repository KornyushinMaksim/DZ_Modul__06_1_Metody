package Task5;

import java.util.Arrays;

public class Squad {

    private Spearman[] squad;
    private int sizeSquad;

    public Squad() {
        this.sizeSquad = 1;
        squad = new Spearman[]{new Spearman()};
    }

    public Squad(int sizeSquad) {
        this.sizeSquad = sizeSquad;
        this.squad = new Spearman[sizeSquad];
        for (int i = 0; i < sizeSquad; i++) {
            this.squad[i] = new Spearman();
        }
    }

    public Squad(int sizeSquad, int hpSpearman, int dmgSpearman) {
        this.sizeSquad = sizeSquad;
        this.squad = new Spearman[sizeSquad];
        for (int i = 0; i < sizeSquad; i++) {
            this.squad[i] = new Spearman(hpSpearman, dmgSpearman);
        }
    }

    public int damageSquad() {           //общий дамаг отряда
        int attack = 0;
        for (int i = 0; i < this.sizeSquad; i++) {
            attack += this.squad[i].getDamage();
        }
        return attack;
    }

    public int healthSquad(){
        int healthSquad = 0;
        for (int i = 0; i < this.sizeSquad; i++){
            healthSquad += this.squad[i].getHealth();
        }
        return healthSquad;
    }

    public void destructionSquad(int valueDmgDragon) {
        int i = 0;
        while (i <= this.squad.length - 1 && valueDmgDragon > 0) {
            if (this.squad[i].getHealth() <= valueDmgDragon) {
                valueDmgDragon -= this.squad[i].getHealth();
                this.squad[i].setLifeSpearman(false);
            } else if (this.squad[i].getHealth() > valueDmgDragon) {
                this.squad[i].setHealth(this.squad[i].getHealth() - valueDmgDragon);
                valueDmgDragon = 0;
            }
            i++;
        }
        this.overwritingSquad();
    }

    private void overwritingSquad() {
        int cnt = 0;
        for (int i = 0; i < this.sizeSquad; i++) {
            if (this.squad[i].getLifeSpearman()) {
                cnt++;
            }
        }
        Spearman[] tempSquad = new Spearman[cnt];
        int j = 0;
        for (int i = 0; i < this.sizeSquad; i++) {
            if (this.squad[i].getLifeSpearman()) {
                tempSquad[j++] = this.squad[i];
            }
        }
        this.squad = tempSquad;
        this.sizeSquad = cnt;
    }

    public String massage(int valueDmgDragon) {
        String str = "";
        if (healthSquad() == 0) {
            str = "Дракон одержал победу!";
        } else {
            str = "Дракон нанес урон " + valueDmgDragon + ", в отряде осталось " + this.sizeSquad +
                    " человек, из них один ранен с остатком HP = " + this.squad[0].getHealth();
        }
        return str;
    }

    @Override
    public String toString() {
        return "\nsquad=" + Arrays.toString(squad);
    }
}
