package task7_3;

import task7_1_2.CanRun;
import task7_1_2.CanSwim;

public abstract class Human implements CanSwim, CanRun {
    @Override
    public void swimToJog() {
        System.out.println("Я плаваю трусцой!");
    }

    @Override
    public void swimUnderwater() {
        System.out.println("Я плаваю под водой!");
    }

    @Override
    public void jogging() {
        System.out.println("Я бегаю трусцой!");
    }
}
