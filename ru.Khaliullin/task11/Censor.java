package task11;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Censor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String s = scanner.nextLine();

        String s1 = censoring(s);

        System.out.println("Вы ввели: ");

        System.out.println(s1);

    }

    public static String censoring(String s){



        String s1 = s.replaceAll("([бБ][яЯ][кК][аА]|кака|жижа|ГрЫжА)" , "__вырезано цензурой__");

       // s1 = s1.replaceAll("БЯКА", "__вырезано цензурой__");
        //Pattern pattern = Pattern.compile("бяка", Pattern.CASE_INSENSITIVE);
        //System.out.println(pattern);
        return s1;
    }


}
