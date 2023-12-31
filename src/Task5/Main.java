//      Королю нужно убить дракона, но в его казне мало средств для покупки армии.
//        Нужно создать программу, используя методы, которая поможет рассчитать минимальное количество копейщиков,
//        которое необходимо, чтобы убить дракона.
//        C клавиатуры вводятся данные:
//        ■ здоровья дракона;
//        ■ атаки дракона;
//        ■ здоровье одного копейщика;
//        ■ атака одного копейщика.
//        Защита, меткость и т. п. не учитывать. Копейщики наносят удар первыми
//        (общий нанесенный урон – это сумма атак всех живых копейщиков).
//        Если атака дракона превышает значение жизни копейщика (например, у копейщика жизни – 10, а атака – 15),
//        то умирает несколько копейщиков,
//        а оставшийся урон идет одному из копейщиков.
//        Например, жизнь дракона – 500, атака – 55, жизнь одного копейщика – 10, атака –10,
//        а количество копейщиков при данных условиях – 20.
//        Лог боя для данного примера должен выглядеть так:
//        Итерация 15
//        Копейщики атакуют (урон 200) – у дракона осталось 300 жизней
//        Дракон атакует – осталось 15 копейщиков, один из которых ранен (осталось 5 жизней)
//        Копейщики атакуют – у дракона осталось 150 жизней
//        Дракон атакует – осталось 9 копейщиков
//        Копейщики атакуют – у дракона осталось 60 жизней
//        Дракон атакует – осталось 4 копейщика, один из которых ранен (осталось 5 жизней)
//        Копейщики атакуют – у дракона осталось 20 жизней
//        Дракон атакует и побеждает

package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите уровень здоровья дракона и его атаку");
        int hpDragon = in.nextInt();
        int dmgDragon = in.nextInt();
        System.out.println("Введите уровень здоровья копейщика, его атаку и количество копейщиков в отряде");
        int hpSpearman = in.nextInt();
        int dmgSpearman = in.nextInt();
        int sizeSquad = in.nextInt();

        Dragon dragon = new Dragon(hpDragon,dmgDragon);
        Squad squad = new Squad(sizeSquad,hpSpearman, dmgSpearman);

        while (squad.healthSquad() > 0){
            System.out.println(dragon.destructionDragon(squad.damageSquad()));
            if (dragon.getHealth() <= 0){
                break;
            }
            squad.destructionSquad(dmgDragon);
            System.out.println(squad.massage(dmgDragon));
        }
    }
}
