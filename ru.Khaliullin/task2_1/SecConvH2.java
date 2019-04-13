package task2_1;

import java.util.Scanner;

public class SecConvH2 {
    public static void main(String args[]){
        double sec;
        double hour;


        System.out.println("Введите количество секунд которые вы хотите преобразовать в часы: ");

        Scanner scanner = new Scanner(System.in);
        sec = scanner.nextDouble();

        hour = sec/3600;

        System.out.println(hour + " часов в " + sec + " секундах!!!" );

    }
}
