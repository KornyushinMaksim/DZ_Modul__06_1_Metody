package Task5;

import java.util.Arrays;

public class Squad {

    private Spearman[] squad;
    private Dragon dragon;
    private int sizeSquad;

    public Squad() {
        this.sizeSquad = 1;
//        if (this.squad[sizeSquad - 1].getDeathSpearman() == false){     //????
            squad = new Spearman[]{new Spearman()};
//        }
    }

    public Squad(int sizeSquad) {
        this.sizeSquad = sizeSquad;
        this.squad = new Spearman[sizeSquad];
        for (int i = 0; i < sizeSquad; i++) {
            this.squad[i] = new Spearman();
        }
    }

//    public Squad(int sizeSquad, Spearman obj) {
//        this.sizeSquad = sizeSquad;
//        this.squad = new Spearman[sizeSquad];
//        for (int i = 0; i < sizeSquad; i++){
////            if (obj.getDeathSpearman() == false) {                  //????
//                this.squad[i] = obj;
////            }
//        }
//    }
            //вопрос по необходимости такого конструктора
    public Squad (int sizeSquad, int hpSpearman, int dmgSpearman){
        this.sizeSquad = sizeSquad;
        this.squad = new Spearman[sizeSquad];
        for (int i = 0; i < sizeSquad; i++){
            this.squad[i] = new Spearman(hpSpearman, dmgSpearman);
        }
    }

    public int damageSquad(){           //общий дамаг отряда
        int attack = 0;
        for (int i = 0; i < this.sizeSquad; i++){
            attack += this.squad[i].getDamage();
        }
        return attack;
    }

    public void destructionSquad(int valueDmgDragon){
        int i = 0;
        while (valueDmgDragon > 0){
            if (this.squad[i].getHealth() <= valueDmgDragon){
                valueDmgDragon -= this.squad[i].getHealth();
                this.squad[i].setLifeSpearman(false);
            } else if (this.squad[i].getHealth() > valueDmgDragon){
                this.squad[i].setHealth(this.squad[i].getHealth() - valueDmgDragon);
                valueDmgDragon = 0;
            }
            i++;
        }
        this.overwritingSquad();
    }

    private void overwritingSquad(){
        Spearman[] tempSquad = new Spearman[this.sizeSquad];
        int cnt = 0;
        for (int i = 0; i < this.sizeSquad; i++){
            if (this.squad[i].getLifeSpearman()){
                tempSquad[i] = this.squad[i];
                cnt++;
            }
        }
        System.arraycopy(this.squad, 0, tempSquad, 0, 4);
        this.sizeSquad = cnt;
    }

    @Override
    public String toString() {
        return "\nSquad Spearman:" + Arrays.toString(squad);
    }
}
