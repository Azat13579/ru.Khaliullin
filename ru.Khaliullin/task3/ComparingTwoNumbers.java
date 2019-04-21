package task3;

import java.util.Scanner;

public class ComparingTwoNumbers {
        public static void main(String[] args){
                int oneNumb;      // первое введенное число
                int twoNumb;     // второе введенное число

                System.out.println("Введите первое число:");
                Scanner scanner = new Scanner(System.in);

                oneNumb = scanner.nextInt();

                System.out.println("Введите второе число:");
                twoNumb = scanner.nextInt();

                System.out.print("Минимальное из двух чисел: ");
                if (oneNumb>twoNumb){   //сравнение первого числа с числом от ПК
                    System.out.println(twoNumb);
                } else {
                    System.out.println(oneNumb);
                }
    }
}
