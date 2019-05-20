package task14;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
import static task14.DrinksAddLogging.*;

public class AppAddLogging {
    private static final Logger logger = Logger.getLogger(AppAddLogging.class.getName());


    //----------------------------------------App vendMach--------------------------
    // private static final Logger logger = Logger.getLogger(AppAddLog.class.getName());


    public static void main(String[] args) {
        logger.log(Level.INFO ,"Программа включилась!");


        DrinksAddLogging[] drink = new DrinksAddLogging[] {COCA, FANTA, SPRITE, KOFFIE,JUICE};

        VengingMachineAddLogging vmM = new VengingMachineAddLogging(drink);
        logger.info("Начала работы программы с пользователем!");
        for (;;) {
            String s = vmM.showMenuM();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Внесите деньги: ");
            double userMoney = scanner.nextDouble();
            System.out.println("Выберете напиток, используя номер напитка: ");
            int userСhoice = scanner.nextInt();
            System.out.println("Выберете напиток, используя номер напитка: ");

            double retirement = 0;
            try {
                retirement = vmM.giveMeADrink(userСhoice, userMoney);
            } catch (Exception e) {  // TODO требует более подходящего исключение!!!
                logger.severe("Пользователь " + s + " ввел не достаточное колличество денег!" );
                logger.log(Level.SEVERE, e.getMessage(), e);

            }

            int money = vmM.addMoney(retirement);
            logger.info("На счету нашего автомата по продажам напитков " + money + " коп.!");


            System.out.println("Чтот бы завершить работу нажмите кнопку X[EN] ");
            Scanner scanner1 = new Scanner(System.in);
            String userX = scanner1.nextLine();
            System.out.println(userX);

            if ("X".equals(toUpperCase(userX))) {
                System.out.println("Завершение работы!Досвидания " + s + "!");
                logger.info("Завершение работы c " + s);
                break;
            }
        }
    }

    //------------------------------------JUL-----------------------------
    /*public static void main(String[] args) throws FileNotFoundException {
        logger.log(Level.FINE, "Начало работы программы");

         try {
            doSome("значение");
         } catch (Exception e) {
           logger.log(Level.SEVERE, e.getMessage(), e);
         }

         System.out.println("Пока!");
         logger.fine("Программа завершена");
         }

         private static void doSome(String value) {
             logger.fine("Вызван метод doSome с параметром <" + value + ">");
             logger.warning("сейчас будет ошибка");
             throw new RuntimeException("Какая-то ошибка");
         }*/
    //------------------------------------log4j-----------------------------
       /* private static final Logger logger = Logger.getLogger(AppAddL.class);

        public static void main(String[] args) throws FileNotFoundException {
            logger.log(Priority.INFO, "Начало работы программы");
            try {
                doSome("значение");
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
            System.out.println("Пока!");
            logger.info("Программа завершена");
        }

        private static void doSome(String value) {
            logger.info("Вызван метод doSome с параметром <" + value + ">");
            logger.warn("сейчас будет ошибка");
            throw new RuntimeException("Какая-то ошибка");
        }*/


}
