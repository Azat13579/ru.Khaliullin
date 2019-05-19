package task13;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static task13.Foods.*;

public class App {
    private static final Logger logger = Logger.getLogger(App.class);
        public static void main(String[] args) throws IOException {

        Mother galina = new Mother();
        Child galinenok = new Child();

        try {
            galina.foodChoice();
        } catch (HateSomeFoodException e){
            logger.error(e.getMessage(), e);
            System.out.println("Галинёнок мало доволен!");
           //e.printStackTrace();
        } finally {
            System.out.println("спасибо, мама!");
            logger.info("Программа завершена");
        }
    }
}
