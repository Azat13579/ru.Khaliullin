package task18;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static java.lang.Integer.parseInt;
import static task18.Codec.*;

public class Encoder {
    public static final Codec[] codec = new Codec[]{UTF8, WINDOWS1251, KOI8};

    /**
     * Выбор формата кодера в который преобразуется данные из нащего файла!!!
     * @return
     * @throws IOException
     */
    public void choiceEncoder() throws IOException {

        System.out.println("Список кодеров: ");
        for (int i = 0; i < codec.length; i++) {
            System.out.println("Кодер № " + (i+1) + " " + codec[i].getNameCod());
        }
    }


    public void transformation(int userChoiceForLoadAndSave, File allFormatFile,
                               int userChoiceForSave) throws IOException {


        String s = null;
        File utf8File = new File(codec[userChoiceForLoadAndSave - 1].getNameCod() + ".txt");
        try (Reader reader = new InputStreamReader(new FileInputStream(allFormatFile),
                codec[userChoiceForSave - 1].getNameCod());
             Writer writer = new OutputStreamWriter(new FileOutputStream(utf8File),
                codec[userChoiceForLoadAndSave - 1].getNameCod())) {

            int c;
            while ((c = reader.read()) != -1) {

                writer.write(c);

            }

        }

    }

}



   /* InputStream is = new FileInputStream(allFormatFile);
    OutputStream os = new FileOutputStream(utf8File)) { // Reader and Writer
        byte[] buf = new byte[100];
        if (is.read(buf) != -1) {
        s = new String(buf, codec[userChoiceForSave - 1].getNameCod());
        System.out.println(s);
        }
        String s1 = s;
        os.write(s1.getBytes(codec[userChoiceForLoadAndSave - 1].getNameCod()));
        }*/

/*}else if(userChoiceForLoadAndSave == 2){
            String s = null;
            File windows1251File = new File("windows1251");
            try(InputStream is = new FileInputStream(allFormatFile);
                OutputStream os = new FileOutputStream(windows1251File)) {
                byte[] buf = new byte[100];
                if (is.read(buf) != -1) {
                    s = new String(buf, codec[userChoiceForSave - 1].getNameCod());
                    System.out.println(s);
                }
                String s1 = s;
                os.write(s1.getBytes(codec[userChoiceForLoadAndSave - 1].getNameCod()));
        }}else if(userChoiceForLoadAndSave == 3){
            String s = null;
            File koi8File = new File("koi8");
            try(InputStream is = new FileInputStream(allFormatFile);
                OutputStream os = new FileOutputStream(koi8File)){
                byte[] buf = new byte[100];
                if(is.read(buf) != -1){
                    s = new String(buf, codec[userChoiceForSave-1].getNameCod());
                    System.out.println(s);
                }
                String s1  = s;
                os.write(s1.getBytes(codec[userChoiceForLoadAndSave-1].getNameCod()));
            }} else {
            System.out.println("Вы ввели номер несуществующего кодера, повторите выбор!");
            choiceEncoder();
            System.out.println("Введите номер выбранного Вами кодера:");
            BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
            String s2 = bufReader.readLine();
            Integer newUserChoice  = parseInt(s2);
            System.out.println("Вы выбрали кодер № " + newUserChoice + "!");
            transformation(newUserChoice, allFormatFile, userChoiceForSave);
        }*/
