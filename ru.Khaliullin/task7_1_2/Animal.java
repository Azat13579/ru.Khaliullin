package task7_1_2;

public abstract class Animal implements CanRun {
   String  name;

   public abstract void getName();

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void run() {
        System.out.println("Я могу бежать!");
    }
}
