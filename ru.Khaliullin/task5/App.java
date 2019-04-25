package task5;


import java.util.Scanner;

import static task5.Drinks.*;

public class App {

    public static void main(String[] args) {

        Drinks[] drink = new Drinks[] {COCA, FANTA, SPRITE, KOFFIE,JUICE};

        VengingMachine vm= new VengingMachine(drink);

        vm.ShowMenu();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Внесите деньги: ");
        int userMoney = scanner.nextInt();
        System.out.println("Выберете напиток, используя номер напитка:");
        int userСhoice = scanner.nextInt();

        double retirement =  vm.giveMeADrink(userСhoice,userMoney);
        vm.addMoney(retirement);


    }
}


