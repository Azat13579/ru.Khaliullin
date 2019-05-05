package Modification.task5_M;

import java.util.Scanner;
import  static Modification.task5_M.DrinksM.*;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class AppM {
    public static void main(String[] args) {
    DrinksM[] drinkM = new DrinksM[] {COCA, FANTA, SPRITE, KOFFIE,JUICE};

    VengingMachineM vmM = new VengingMachineM(drinkM);

        for (;;) {
            vmM.showMenuM();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Внесите деньги: ");
            double userMoney = scanner.nextDouble();
            System.out.println("Выберете напиток, используя номер напитка:");
            int userСhoice = scanner.nextInt();
            System.out.println("Выберете напиток, используя номер напитка:");

            double retirement = vmM.giveMeADrink(userСhoice, userMoney);
            vmM.addMoney(retirement);

            System.out.println("Чтот бы завершить работу нажмите кнопку X[EN]");
            Scanner scanner1 = new Scanner(System.in);
            String userX = scanner1.nextLine();
            System.out.println(userX);

            if ("X".equals(toUpperCase(userX))) {
                System.out.println("Завершение работы!Досвидания!");
                break;
            }
        }
    }
}



