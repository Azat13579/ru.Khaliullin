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

