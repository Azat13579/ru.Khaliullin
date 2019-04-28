package task7_1_2;

public class Duck extends Birds implements CanSwim{
    public void getName(){
        System.out.println("I am a Duck!");
    }

    public void fly() {
        System.out.println("Я уточка и я летаю!");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                "} "+ super.toString();
    }

    @Override
    public void swim() {
        System.out.println("Еще я умею плавать!");
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
    public void jogging() {
        System.out.println("Я так не умею!Но знаю, что так умеет человек!");
    }
}
