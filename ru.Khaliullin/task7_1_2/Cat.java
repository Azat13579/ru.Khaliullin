package task7_1_2;

public class Cat extends Mammals{

    public void getName(){
        System.out.println("I am a Cat!");
    }

    @Override
    public void swim() {
        System.out.println("Я Кот и я не особо люблю плавать!");
    }

    @Override
    public void swimToJog() {
        System.out.println("Я так не умею!Но знаю, что так умеет человечешка!");
    }

    @Override
    public void swimUnderwater() {
        System.out.println(" Я так не умею!Но знаю, что так умеет человечешка!");
    }

    @Override
    public void run() {
            System.out.println("Я могу бежать как пантера!");
    }

    @Override
    public void jogging() {
        System.out.println("Я так не умею!Но знаю, что так умеет человечешка!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                "} "; //+ super.toString();
    }
}
