package task5;


import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
import static task5.Drinks.*;

public class App {

    public static void main(String[] args) {

        Drinks[] drink = new Drinks[] {COCA, FANTA, SPRITE, KOFFIE,JUICE};

        VengingMachine vm = new VengingMachine(drink);
        for (;;) {
            vm.ShowMenu();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Внесите деньги: ");
            int userMoney = scanner.nextInt();
            System.out.println("Выберете напиток, используя номер напитка:");
            int userСhoice = scanner.nextInt();

            double retirement = vm.giveMeADrink(userСhoice, userMoney);
            vm.addMoney(retirement);

            System.out.println("Что бы завершить работу нажмите кнопку X[EN]");
            Scanner scanner1 = new Scanner(System.in);
            String userX = scanner1.nextLine();
            System.out.println(userX);

            if (userX.equals(toUpperCase("X"))){
                System.out.println("Завершение работы!Досвидания!");
                break;
            }
        }

    }


}


