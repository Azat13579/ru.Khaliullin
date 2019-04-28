package task7_1;

public class App {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Birds duck = new Duck();
        duck.getName();
        duck.fly();
        cat.getName();
        dog.getName();
        duck.Run();

        cat.setName("Cat");
        dog.setName("Dog");
        duck.setName("Duck");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(duck);

    }

}
