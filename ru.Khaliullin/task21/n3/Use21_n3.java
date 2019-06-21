package task21.n3;

public class Use21_n3 {
    public static void main(String[] args) {
        int maxSize = 10;
        ArreySel_n2 arr;
        arr = new ArreySel_n2(maxSize);

        arr.insert(77);
        arr.insert(990);
        arr.insert(40);
        arr.insert(55);
        arr.insert(221);
        arr.insert(8);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        arr.arrayFlip();

        arr.display();

    }
}
