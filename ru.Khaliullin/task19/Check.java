package task19;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Check {
    public void search() throws IOException {

        File file1 = new File("D:\\Обучение\\IdeaProjects2test\\ru.Khaliullin\\" +
                "ru.Khaliullin\\task19\\products.txt");
        File file2 = new File("D:\\Обучение\\IdeaProjects2test\\ru.Khaliullin\\" +
                "ru.Khaliullin\\task19\\out.txt");

        try (FileReader fr = new FileReader(file1);
             Scanner scanner = new Scanner(fr); PrintWriter pw = new PrintWriter (file2);
        ) {
            scanner.useLocale(Locale.ENGLISH);
            pw.format(" %1s %11s %8s %12s %n", "Наименование", "Цена", "Кол-во", "Стоимость");
            pw.format(" = = = = = = = = = = = = = = = = = = = = = = =%n");

            double allAdd = 0;

            while(scanner.hasNext()){
                double d;
                double d1;
                double count;
                String s = null;
                int i=0;
                if(scanner.hasNextDouble()
                ){
                    d = scanner.nextDouble();
                    d1 = scanner.nextDouble();
                    count = d*d1;
                    allAdd=allAdd+count;

                    pw.format("%10.1f %1s  %5.1f %11.1f %n", d1, "x", d, count);

                }else if(scanner.hasNext()){
                    s = scanner.nextLine();
                    if (("").equals(s)){
                        i++;
                        //System.out.println(i);
                    }else {

                        pw.format("%15s", s);
                    }


                }

                }
            pw.format(" = = = = = = = = = = = = = = = = = = = = = = =  %n");
            pw.format(" %1s%39.2f%n","Итого:",allAdd);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }}
