package task2_1;
import java.util.Scanner;
public class Wage2 {
    public static void main(String args[]){
        double tax = 0.13;
        double wageAndTax;
        double wage;

        System.out.println("Введите сумму вашей заработной платы без учёта вычета налога: ");
        Scanner scanner = new Scanner(System.in);
        wageAndTax = scanner.nextDouble();

        wage = wageAndTax - (wageAndTax*tax);

        System.out.println("Ваша зарплата с учётом вычета налога " + wage + " руб.");

    }
}
