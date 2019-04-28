package task7_1;

public abstract class Birds extends Animal implements Flyeble{
    @Override
    public void fly() {
        System.out.println("Я летаю!");
    }
}
