package task20;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import com.fasterxml.jackson.databind.ObjectMapper;

import static java.lang.Integer.parseInt;

public class Use20 {



    public static void main(String[] args) throws IOException {


        CharacterFromTheWorldOfRicaAndMortality f1 = new CharacterFromTheWorldOfRicaAndMortality(777,
                "Abersolt","alive", "Human", " ", "Male");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("characterFile.json"), f1);


        System.out.println("Введите номер персонажа:");

        int n = characterSelection();

        System.out.println("Характеристики выбранного Вами персонажа:");

        characterDescriptionAndSavingToFileForWork(n);
    }

   private static void characterDescriptionAndSavingToFileForWork(int n) {

        try {
             URL url = new URL("https://rickandmortyapi.com/api/character/" + n);
             try (InputStream is = url.openStream();
                  Reader reader = new InputStreamReader(is);
                  BufferedReader br = new BufferedReader(reader);
             ){
                 System.out.println(br.readLine());
                 System.out.println();
                 System.out.println();
                 System.out.println();


                 ObjectMapper objectMapper = new ObjectMapper();
                 CharacterFromTheWorldOfRicaAndMortality f8 = objectMapper.readValue(url,
                         CharacterFromTheWorldOfRicaAndMortality.class);

                 objectMapper.writeValue(new File("characterFile1.json"), f8);

                 System.out.println(f8.name);

                 objectMapper.writeValue(System.out, f8.status);

             }

         } catch (IOException e) {
             e.printStackTrace();
         }
    }

    private static int characterSelection() throws IOException {
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufReader.readLine();
        return parseInt(s);
    }


}
