package task7_3;

import task7_1_2.CanRun;
import task7_1_2.CanSwim;

public class Man extends Human{

    @Override
    public void run() {
        System.out.println("Я бегаю!");
    }

    @Override
    public void swim() {
        System.out.println("Я плаваю!");
    }

    @Override
    public void swimToJog() {
        System.out.println("Я плаваю со скоростью метиора!");
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
