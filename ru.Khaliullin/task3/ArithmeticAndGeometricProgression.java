package task3;

import java.util.Scanner;

public class ArithmeticAndGeometricProgression {
    public static void main(String[] args) {
        int firstElementProgression;   // первое введенное число
        int differenceProgression;     // разность прогрессии
        int numberOfIterations;        // количество итераций

        System.out.println("Введите первый элемент прогрессии: ");
        Scanner scanner = new Scanner(System.in);

        firstElementProgression = scanner.nextInt();

        System.out.println("Введите разность прогрессии: ");
        differenceProgression = scanner.nextInt();


        System.out.println("Введите количество итераций: ");
        numberOfIterations = scanner.nextInt();


        /*for (int i = 1; i <=numberOfIterations; i++) {

            System.out.println(firstElementProgression);

            firstElementProgression = firstElementProgression  + differenceProgression;

        }*/


        for (int i = 1; i <=numberOfIterations; i++) {

            System.out.println(firstElementProgression);

            firstElementProgression = firstElementProgression  * differenceProgression;

        }
    }
}
