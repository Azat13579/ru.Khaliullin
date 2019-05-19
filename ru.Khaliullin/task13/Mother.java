package task13;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static task13.Foods.*;

public class Mother  {
    private Foods[] food= new Foods[]{null, CARROT, APPLE, MILK_SOUP, PORRIDGE, BANANA,
               PORRIDGE};


    public void foodChoice() throws IOException, HateSomeFoodException {
        System.out.println("Что у нас есть в холодильнике??");

        for(int i = 1; i <= 6 ; i++) {
            System.out.println(" Еда  " + (i) + " " + this.food[i]);
        }

        System.out.println("Выберете еду:");
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufReader.readLine();
        Integer i = Integer.parseInt(s);

        System.out.println("Вы выбрали: " + i);
        Child.eating( food[i] );

    }


}

