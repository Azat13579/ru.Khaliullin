package Modification.task5_M;

import java.util.Arrays;
import java.util.Scanner;

public class VengingMachineM {
    private DrinksM[] drink;
    private static int money = 0;

    public void showMenuM(){
        System.out.println("Введитет свое имя?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Введитет свою фамилию?");
        String secondName = scanner.nextLine();

        System.out.println("Здравствуйте, " + name + " " + secondName + "!");

        System.out.println("Ознакомьтесь со списком напитков:");

        for (int i = 0; i <= 4 ; i++) {
            System.out.println(i+1 +" Напиток " + this.drink[i].DrinkM + " (" +this.drink[i].priceM + " руб.)");
        }

    }

    public int giveMeADrink(int userСhoice, double userMoney){

// метод 1 контроль выбора напитка из списка предлогаемых
        userСhoice = VengingMachineM.selectionСontrol(userСhoice);
// метод 1 - - -

        System.out.println("Вы выбрали " + this.drink[userСhoice-1].DrinkM + "!");

// метод 2 контроль достаточного колличества денег
        int n = this.drink[userСhoice-1].priceM;
        userMoney = VengingMachineM.moneyControl(n, userMoney);
// метод 2 - - -

        System.out.println(" ");
        System.out.println("У вас на счету " + userMoney + " руб.");

// метод 3 приготовление напитка
        VengingMachineM.makingADrink();
        System.out.println("Ваш напиток готов!Заберите " + this.drink[userСhoice-1].DrinkM +"!");
// метод 3 - - -

// метод 4 возврат сдачи пользователю
        int userMoney1 = (int)(userMoney)-this.drink[userСhoice-1].priceM;
        if (userMoney>0) {
            System.out.println("Получите сдачу " + userMoney1 + " руб.");
        }
        return drink[userСhoice-1].priceM;
    }
// метод 4 - - -

// метод 5 добавление денег в кошелек напиткогого аппарата
    public void addMoney(double userMoney){
        money = money + (int)(userMoney*100.0);
        System.out.println("На счету нашего автомата по продажам напитков " + money + " коп.!");
    }
// метод 5  - - -

// тело метода 1 контроль выбора напитка из списка предлогаемых
    private static int selectionСontrol(int userСhoice) {
        for (int i = 0; i <= 1; ) {
            if (0 > (userСhoice - 1) || (userСhoice - 1) > 4) {
                System.out.println("Вы выбралит номер напитка не доступный на данный момент!Попробуйте еще раз!");
                Scanner scanner1 = new Scanner(System.in);
                int userСhoiceN = scanner1.nextInt();
                 userСhoice = userСhoiceN;
                } else {
                i = i+1;
            }
        }
        return userСhoice;
    }
// метод 1 - - -

// тело метод 2 контроль достаточного колличества денег
     private static double moneyControl(int userСhoice, double userMoney) {
         for (int i = 0; i <=1 ; i++) {
             if (userСhoice > userMoney){
                 System.out.println("У вас на счету " + userMoney + " руб." +
                         " Для приобретения напитка внесите еще денег!");
                 Scanner scanner1 = new Scanner(System.in);
                 double userMoneyN = scanner1.nextDouble();
                 userMoney = userMoney + userMoneyN;
                 } else{
                 i = i + 1;
             }
         }
         return userMoney;
     }
// метод 2 - - -

// тело метод 3 приготовление напитка
    private static void makingADrink() {
        System.out.println("Ваш напиток готовиться!");
        for (int i1=1; i1<=2; i1++) {
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(".");
                }
                System.out.println(" ");
            }

            for (int j1 = 4; j1 >= 1; j1--) {
                for (int j2 = 1; j2 <= j1; j2++) {
                    System.out.print(".");
                }
                System.out.println(" ");
            }
        }
    }
// метод 3 - - -

    public VengingMachineM(DrinksM[] drink){
        this.drink = drink;
    }

    public DrinksM[] getDrink() {
        return drink;
    }

    public void setDrink(DrinksM[] drink) {
        this.drink = drink;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "VengingMachineM{" +
                "drink=" + Arrays.toString(drink) +
                ", money=" + money +
                '}';
    }
}
