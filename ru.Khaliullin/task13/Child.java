package task13;
import static task13.Foods.*;

public class Child {

    public static void eating(Foods f) throws HateSomeFoodException {

        if (f == CARROT ||f == PORRIDGE){
            throw new HateSomeFoodException();
        } else {
            System.out.println("съел . . . за обе щеки ");
        }
    }
}