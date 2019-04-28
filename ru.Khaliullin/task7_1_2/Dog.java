package task7_1_2;

public class Dog extends Mammals{
    public void getName(){
        System.out.println("I am a Dog!");
    }

    @Override
    public void swim() {
        System.out.println("Я Собака и я обожаю плавать!");
    }

    @Override
    public void swimToJog() {
        System.out.println("Я так не умею!Но знаю, что так умеет человек!");
    }

    @Override
    public void swimUnderwater() {
        System.out.println("Я так не умею!Но знаю, что так умеет человек!");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                "} "; // + super.toString();
    }

    @Override
    public void jogging() {
        System.out.println("Я так не умею!Но знаю, что так умеет человек!");
    }
}
