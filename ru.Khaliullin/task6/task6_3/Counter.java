package task6.task6_3;

public class Counter {
    public static int counter=0;

    public static void main(String[] args) {
        Counter c1 = new Counter();
        int z1=c1.counterOutput(counter);
        System.out.println(z1);

        Counter c2 = new Counter();
        int h = counter;
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        int z2=c2.counterOutput(h);
        System.out.println(z2);

    }

    public int counterOutput(int count){
        int counter=count;
        return counter;
    }

    public Counter() {
        counter++;
    }
}
