package task3;

//import java.util.Scanner;

import java.util.Scanner;

import static java.util.Scanner.*;

public class NumberIdentification {
    static int oneNumb;      // введенное число

    static int dividesByTwo(int a){

        int c;
        if(a%2==0) {
            c = 1;
        } else {
            c = 0;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);

        oneNumb = scanner.nextInt();

       /*if (Char.IsNumber(oneNumb)){
            System.out.print("Введено некоректное число!");
        }*/


        System.out.print("Вы ввели ");


        if (oneNumb>0){
            System.out.print("положительное, ");
        } else if (oneNumb < 0){
            System.out.print("отрицательное, ");
        } else {
            System.out.print("нулевое, ");
        }

        switch (dividesByTwo(oneNumb)){
            case (1): {
                System.out.println("чётное число!");
                break;
            }
            case (0): {
                System.out.println("не чётное число!");
                break;
            }
        }
    }



}

