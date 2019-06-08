package task18;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.lang.Integer.parseInt;
import static task18.Codec.*;

public class Use {
    public static void main(String[] args) throws IOException {
        Encoder encoder = new Encoder();

        Codec[] codec = new Codec[]{UTF8, WINDOWS1251, KOI8};

        encoder.choiceEncoder(); // вывод списка форматов
        int userChoiceForSave = userСhoice(); // 1 выбор  формата пользователем
        System.out.println("Вы выбрали кодер № " + userChoiceForSave  + "!");

        //вводим данные с консоли и сохраняем в файл allFormatFile в выбранном пользователем формате
        File allFormatFile = new File("allFormatFile.txt");
        try(OutputStream os = new FileOutputStream(allFormatFile)){
            System.out.println("Введите текст который вы хотите сохранить в файле: ");
            BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
            String s1 = bufReader.readLine();
            os.write(s1.getBytes(codec[userChoiceForSave-1].getNameCod()));
        }

        // вывод на консоль размера  файла с данными занимаемой в прамяти
        Path path = allFormatFile.toPath();
        System.out.println(Files.size(path));

        encoder.choiceEncoder(); // вывод списка форматов
        int userChoiceForLoadAndSave  = userСhoice();// 2 выбор формата пользователем
        System.out.println("Вы выбрали кодер № " + userChoiceForLoadAndSave   + "!");

        //чтение данных с файла allFormatFile и сохранение в новом файле в формате 2
        encoder.transformation(userChoiceForLoadAndSave, allFormatFile, userChoiceForSave);
    }



    public static int userСhoice() throws IOException {
        System.out.println("Введите номер выбранного Вами кодера:");
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufReader.readLine();
        int c  = parseInt(s);
        if (c<4 && c>0){
            c = c;
        }else{
            System.out.println("Вы ввели номер несуществующего кодера, повторите выбор!");
            Encoder encoder = new Encoder();
            encoder.choiceEncoder();
            int newUserChoice1  = userСhoice();
            c = newUserChoice1;
        }

        return c;

    }

}
