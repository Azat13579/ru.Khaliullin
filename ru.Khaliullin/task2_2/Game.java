package task2_2;

import java.util.Random;
import java.util.Scanner;


public class Game {



    public static void main(String args[]){
        int n;      // рандомное число
        int n1;     // первое введенное число
        int n2;     // второе введенное число

        int n3;     // разница между n  и n1
        int n4;     // разница между n  и n2

        int j = 0;  // переменная для цикла

        Random rand = new Random();
            n = rand.nextInt(100);
             //System.out.println(n);

            System.out.println(" Программа загадало число от 1 до 100! Как думаешь какое оно:");

                    Scanner scanner = new Scanner(System.in);
                    n1 = scanner.nextInt();
                    //System.out.println(n1);

                        if (n == n1) {   //сравнение первого числа с числом от ПК
                            System.out.println("БИНГО!!!");
                        }
                            else {
                            System.out.println("Мимоо! Попробуй ещё разок!");

                                for (int i = 0; i < 1; i=j){
                                    Scanner scanner1 = new Scanner(System.in);
                                    n2 = scanner1.nextInt();
                                    //System.out.println(n2);

                                         n3=n-n1;  // разница между числом от ПК и первым введенным числом(или вторым присвоенным от n2)
                                         n4=n-n2; // разница между числом от ПК и последующим введенным числом

                                    //if (n3 <0 || n4 <0) { // если число отрицательное,делаем его положительным
                                    //    n3=n3*(-1);
                                    //    n4=n4*(-1);
                                    //}





                                    if (n == n2) {//сравнение последующего числа с числом от ПК
                                            System.out.println("БИНГО!!!");
                                            j = 1;
                                        }
                                                else if(Math.abs(n4) > Math.abs(n3) ) { // сравнение разницы введенных пользователем чисел
                                                                   // относительно загаданной ПК
                                                    System.out.println("Холоднее!!!");
                                                    n1=n2;
                                                    j = 0;

                                             }      else if (Math.abs(n4) < Math.abs(n3)|| Math.abs(n4) == Math.abs(n3)){

                                                     System.out.println("Теплее!!!");
                                                     n1=n2;
                                                     j = 0;
                                                     }
                                    }
                                 }
        }
    }

