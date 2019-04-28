package task7_1;

public class Cat extends Mammals{

    public void getName(){
        System.out.println("I am a Cat!");
    }

    @Override
    public void swim() {
        System.out.println("Я Кот и я не особо люблю плавать!");
    }

    @Override
    public void Run() {
            System.out.println("Я могу бежать как пантера!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                "} "; //+ super.toString();
    }
}
