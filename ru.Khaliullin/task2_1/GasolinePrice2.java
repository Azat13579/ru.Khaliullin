package task2_1;

import java.util.Scanner;

public class GasolinePrice2 {



    public static void main(String args[]){
        double liter;
        int price1Liter = 43;
        double priceNLiter;

        System.out.println("Сколько литров бензина вы хотите приобрести: ");

        Scanner scanner = new Scanner(System.in);
        liter = scanner.nextInt();

        priceNLiter = liter * price1Liter;

        System.out.println(liter + " литров бензина, стоит: " + priceNLiter + " руб.");

    }
}
