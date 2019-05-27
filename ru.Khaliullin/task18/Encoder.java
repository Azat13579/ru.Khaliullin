package task18;

import java.io.*;
import static java.lang.Integer.parseInt;
import static task18.Codec.*;

public class Encoder {
    public static final Codec[] codec = new Codec[]{UTF8, WINDOWS1251, KOI8};

    /**
     * Выбор формата кодера в который преобразуется данные из нащего файла!!!
     * @return
     * @throws IOException
     */
    public int choiceEncoder() throws IOException {

        System.out.println("Список кодеров: ");
        for (int i = 0; i < codec.length; i++) {
            System.out.println("Кодер № " + (i+1) + " " + codec[i].getNameCod());
        }

        System.out.println("Введите номер выбранного Вами кодера:");
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufReader.readLine();
        Integer userChoice = parseInt(s);
        System.out.println("Вы выбрали кодер № " + userChoice + "!");

        return userChoice;
    }


    public void transformation(int userChoiceForLoadAndSave, File allFormatFile, int userChoiceForSave) throws IOException {

        if(userChoiceForLoadAndSave == 1){
            String s = null;
            File utf8File = new File("utf8.txt");
            try(InputStream is = new FileInputStream(allFormatFile)){
                byte[] buf = new byte[100];
                if(is.read(buf) != -1){
                    s = new String(buf, codec[userChoiceForSave-1].getNameCod());
                    System.out.println(s);
                }
            }

            try(OutputStream os = new FileOutputStream(utf8File)){
                String s1  = s;
                os.write(s1.getBytes(codec[userChoiceForLoadAndSave-1].getNameCod()));
            }



        }else if(userChoiceForLoadAndSave == 2){
            String s = null;
            File windows1251File = new File("windows1251.txt");
            try(InputStream is = new FileInputStream(allFormatFile)){
                byte[] buf = new byte[100];
                if(is.read(buf) != -1){
                    s = new String(buf, codec[userChoiceForSave-1].getNameCod());
                    System.out.println(s);
                }
            }

            try(OutputStream os = new FileOutputStream(windows1251File)){
                String s1  = s;
                os.write(s1.getBytes(codec[userChoiceForLoadAndSave-1].getNameCod()));
            }
        }
        else if(userChoiceForLoadAndSave == 3){
            String s = null;
            File koi8File = new File("koi8.txt");
            try(InputStream is = new FileInputStream(allFormatFile)){
                byte[] buf = new byte[100];
                if(is.read(buf) != -1){
                    s = new String(buf, codec[userChoiceForSave-1].getNameCod());
                    System.out.println(s);
                }
            }

            try(OutputStream os = new FileOutputStream(koi8File)){
                String s1  = s;
                os.write(s1.getBytes(codec[userChoiceForLoadAndSave-1].getNameCod()));
            }

        } else {
            System.out.println("Вы ввели номер несуществующего кодера, повторите выбор!");
            int newUserChoice = choiceEncoder();
            transformation(newUserChoice, allFormatFile, userChoiceForSave);
        }
    }

}
