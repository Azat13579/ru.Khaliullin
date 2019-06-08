package task19;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Check {
    public void search() throws IOException {

        File file1 = new File("task19\\products.txt");  //
        File file2 = new File("task19\\out.txt");  //

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
                int i = 0;
                i++;
                if(scanner.hasNextDouble()) {

                    d = scanner.nextDouble();
                    d1 = scanner.nextDouble();

                    count = d * d1;
                    allAdd = allAdd + count;

                    String number = formatOfTheTotalAmountOfOneProduct(count);


                    if ((d%1) == 0) {
                        pw.format("%10.2f %1s  %5.0f %11s %n", d1, "x", d, number);
                    }else {
                        pw.format("%10.2f %1s  %5.3f %11s %n", d1, "x", d, number);
                    }

                }else if(scanner.hasNext()) {

                    missingSpacesAndDisplayingTheProductName(scanner, pw, i);

                }

                }
            pw.format(" = = = = = = = = = = = = = = = = = = = = = = =  %n");
            pw.format(" %1s%39.2f%n", "Итого:", allAdd);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void missingSpacesAndDisplayingTheProductName(Scanner scanner, PrintWriter pw, int i) {
        String s;
        String s1 = scanner.nextLine();
        if (("").equals(s1)) {

        } else {
            s = s1;
            pw.format("%15s", s);
        }
    }

    private String formatOfTheTotalAmountOfOneProduct(double count) {
        String pattern;
        if ((count % 1) > 0 || (count % 1)< 10) {
            pattern = "=####.00";
        }else{
            pattern = "=####.##";
        }

        DecimalFormat dm = new DecimalFormat(pattern);
        return dm.format (count);
    }
}
