package task18;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import static task18.Codec.*;

public class Use {
    public static void main(String[] args) throws IOException {
        Encoder encoder = new Encoder();

        Codec[] codec = new Codec[]{UTF8, WINDOWS1251, KOI8};
        int userChoiceForSave = encoder.choiceEncoder();

        File allFormatFile = new File("allFormatFile.txt");
        try(OutputStream os = new FileOutputStream(allFormatFile)){
            System.out.println("Введите текст который вы хотите сохранить в файле: ");
            BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
            String s = bufReader.readLine();
            os.write(s.getBytes(codec[userChoiceForSave-1].getNameCod()));
        }

        Path path = allFormatFile.toPath();
        System.out.println(Files.size(path));

        int userChoiceForLoadAndSave = encoder.choiceEncoder();
        System.out.println(userChoiceForLoadAndSave);

        encoder.transformation(userChoiceForLoadAndSave, allFormatFile, userChoiceForSave);
    }
}
