package task14;

import java.util.Arrays;
import java.util.Scanner;

public class VengingMachineAddLogging {
    private DrinksAddLogging[] drink;
    private static int money = 0;

    public String showMenuM(){
        System.out.println("Введите свое имя?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Введите свою фамилию?");
        String secondName = scanner.nextLine();

        System.out.println(" Здравствуйте, " + name + " " + secondName + "!");

        System.out.println("Ознакомьтесь со списком напитков: ");

        for (int i = 0; i <= 4 ; i++) {
            System.out.println(i+1 +" Напиток " + this.drink[i].Drink + " (" +this.drink[i].price + " руб.)");
        }
        String s = name + " " + secondName;
        return s;
    }

    public int giveMeADrink(int userСhoice, double userMoney) throws Exception {

// метод 1 контроль выбора напитка из списка предлогаемых
        userСhoice = VengingMachineAddLogging.selectionСontrol(userСhoice);
// метод 1 - - -

        System.out.println("Вы выбрали " + this.drink[userСhoice-1].Drink + "!");

// метод 2 контроль достаточного колличества денег
        int n = this.drink[userСhoice-1].price;
        userMoney = VengingMachineAddLogging.moneyControl(n, userMoney);
// метод 2 - - -

        System.out.println(" ");
        System.out.println("У вас на счету " + userMoney + " руб.");

// метод 3 приготовление напитка
        VengingMachineAddLogging.makingADrink();
        System.out.println("Ваш напиток готов!Заберите " + this.drink[userСhoice-1].Drink +"!");
// метод 3 - - -

// метод 4 возврат сдачи пользователю
        int userMoney1 = (int)(userMoney)-this.drink[userСhoice-1].price;
        if (userMoney>0) {
            System.out.println("Получите сдачу " + userMoney1 + " руб.");
        }
        return drink[userСhoice-1].price;
    }
// метод 4 - - -

    // метод 5 добавление денег в кошелек напиткогого аппарата
    public int addMoney(double userMoney){
        money = money + (int)(userMoney*100.0);
        return money;
    }
// метод 5  - - -

    // тело метода 1 контроль выбора напитка из списка предлогаемых
    private static int selectionСontrol(int userСhoice) {
        for (int i = 0; i <= 1; ) {
            if (0 > (userСhoice - 1) || (userСhoice - 1) > 4) {
                System.out.println("Вы выбралит номер напитка не доступный на данный момент! Попробуйте еще раз!");
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
    //
    private static double moneyControl(int uСhoice, double userMoney) throws Exception {
        for (int i = 0; i <=1 ; i++) {
            if (uСhoice > userMoney){
                System.out.println("нехватило денег!");
                throw new Exception();
                /*System.out.println("У вас на счету " + userMoney + " руб. " +
                        " Для приобретения напитка внесите еще денег!");
                Scanner scanner1 = new Scanner(System.in);
                double userMoneyN = scanner1.nextDouble();
                userMoney = userMoney + userMoneyN;*/
            } else{
                i = i + 1;
            }
        }
        return userMoney;
    }
// метод 2 - - -

    // тело метод 3 приготовление напитка
    private static void makingADrink() {
        System.out.println("Ваш напиток готовиться! ");
        for (int i1 = 1; i1 <= 2; i1 ++) {
            for (int i = 1; i <= 5; i ++) {
                for (int j = 1; j <= i; j ++) {
                    System.out.print(" .");
                }
                System.out.println(" ");
            }

            for (int j1 = 4; j1 >= 1; j1 --) {
                for (int j2 = 1; j2 <= j1; j2 ++) {
                    System.out.print(" .");
                }
                System.out.println(" ");
            }
        }
    }
// метод 3 - - -

    public VengingMachineAddLogging(DrinksAddLogging[] drink){
        this.drink = drink;
    }

    public DrinksAddLogging[] getDrink() {
        return drink;
    }

    public void setDrink(DrinksAddLogging[] drink) {
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
