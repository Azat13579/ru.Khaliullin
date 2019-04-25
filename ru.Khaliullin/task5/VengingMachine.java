package task5;

import java.util.Arrays;
import java.util.Scanner;

public class VengingMachine {
   private Drinks[] drink;
   private static int money = 0;

    public void ShowMenu (){
        System.out.println("Введите свое имя?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Введите свою фамилию?");
        String secondName = scanner.nextLine();

        System.out.println("Здравствуйте, " + name + " " + secondName + "!");

        System.out.println("Ознакомьтесь со списком напитков:");

        for (int i = 0; i <= 4 ; i++) {
           System.out.println(i+1 +" Напиток " + this.drink[i].Drink + " (" +this.drink[i].price + " руб.)");
        }

    }

    public double giveMeADrink(int userСhoice, int userMoney){

        System.out.println("Вы выбрали " + this.drink[userСhoice-1].Drink + "!");
        System.out.println(" ");
        System.out.println(this.drink[userСhoice-1].price);
        System.out.println(" ");
        int x =this.drink[userСhoice-1].price;

        for (int i = 0; i <=1 ; i++) {
            if (x > userMoney){
                System.out.println("У вас на счету " + userMoney + " руб." +
                        " Для приобретения напитка внесите еще денег!");
                Scanner scanner1 = new Scanner(System.in);
                int userMoneyN = scanner1.nextInt();
                userMoney =userMoney + userMoneyN;
                i = 0;
            } else{
                i = 1;
            }
        }

        System.out.println(" ");
        System.out.println("У вас на счету " + userMoney + " руб.");
        System.out.println("Ваш напиток готовиться!");
        System.out.println(".");
        System.out.println("..");
        System.out.println("...");
        System.out.println("....");
        System.out.println(".....");
        System.out.println("....");
        System.out.println("...");
        System.out.println("..");
        System.out.println(".");
        System.out.println(".");
        System.out.println("..");
        System.out.println("...");
        System.out.println("....");
        System.out.println(".....");
        System.out.println("....");
        System.out.println("...");
        System.out.println("..");
        System.out.println(".");
        System.out.println("Ваш напиток готов!Заберите " + this.drink[userСhoice-1].Drink);

        int userMoney1 = userMoney-this.drink[userСhoice-1].price;
        if (userMoney>0) {
            System.out.println("Получите сдачу " + userMoney1 + " руб.");
        }
        return drink[userСhoice-1].price;
    }



    public void addMoney(double userMoney){
        money = money + (int)userMoney;
        System.out.println("На счету нашего автомата по продажам напитков " + money + " руб.!");

    }

    public VengingMachine(Drinks[] drink){
        this.drink = drink;
    }

    public Drinks[] getDrink() {
        return drink;
    }

    public void setDrink(Drinks[] drink) {
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
        return "VengingMachine{" +
                "drink=" + Arrays.toString(drink) +
                ", money=" + money +
                '}';
    }
}
