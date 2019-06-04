package task21.n2;

public class Use21_n2 {
    public static void main(String[] args) {
        int maxSize = 10;            // array size
        ArraySel arr;                 // reference to array
        arr = new ArraySel(maxSize);  // create the array

        arr.insert(770);               // insert 10 items
        arr.insert(99);
        arr.insert(404);
        arr.insert(550);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();                // display items

        arr.selectionSort();          // selection-sort them

        arr.display();

    }
}

