package task7_3;

public class Woman extends Human {
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
        super.swimToJog();
    }

    @Override
    public void swimUnderwater() {
        super.swimUnderwater();
    }

    @Override
    public void jogging() {
        super.jogging();
    }
}
