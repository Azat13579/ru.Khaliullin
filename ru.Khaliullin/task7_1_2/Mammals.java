package task7_1;

public abstract class Mammals extends Animal implements CanSwim {

    public abstract void getName();

    @Override
    public void swim() {
        System.out.println("Я умею плавать!");
    }

    public void setName(String name) {
        this.name = name;
    }
}
