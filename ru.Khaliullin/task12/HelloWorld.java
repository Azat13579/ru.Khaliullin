package task12;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.*;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        /*Desktop desktop = null;
        desktop = desktop.getDesktop();
        desktop.open(new File("D:\\Обучение\\ДЗ 4.txt"));*/



        try {
             String s1[] = new String[5];
             s1[0] = "Hello";
             s1[1] = ",";
             s1[2] = " ";
             s1[3] = "World";
             s1[4] = "!";
            System.out.println(s1[0] + s1[1] + s1[2] + s1[3] + s1[5]);
            } catch (ArrayIndexOutOfBoundsException aioobe){
            aioobe.printStackTrace();
            System.out.println("Произошло первое исключение!!!");
        }

        try {
           try {
                String s = "Hello, World";
                s = null;
                System.out.println(s.length());
            } catch (NullPointerException npe) {
                npe.printStackTrace();
                System.out.println("Произошло второе исключение: " + npe.getMessage());
             }

            throw new NullPointerException("Hello, World");

        } catch (NullPointerException npe) {
           System.out.println("ошибка???");
           throw npe;
        }
    }
}
