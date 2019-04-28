package task7_1;

public class Dog extends Mammals{
    public void getName(){
        System.out.println("I am a Dog!");
    }

    @Override
    public void swim() {
        System.out.println("Я Собака и я обожаю плавать!");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                "} "; // + super.toString();
    }
}
