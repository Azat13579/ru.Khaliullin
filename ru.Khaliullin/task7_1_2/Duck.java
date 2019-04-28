package task7_1;

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
}
