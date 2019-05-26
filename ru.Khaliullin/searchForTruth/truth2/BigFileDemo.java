package searchForTruth.truth2;

import java.io.*;

public class BigFileDemo {
    private static final int BUFFER_SIZE = 1042; //4096*4096;
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("D:\\Обучение\\IdeaProjects2test\\ru.Khaliullin\\ru.Khaliullin\\" +
                "searchForTruth\\truth2\\Павловская_C++_ООП_Практикум.pdf");
        OutputStream os = new FileOutputStream("D:\\Обучение\\IdeaProjects2test\\ru.Khaliullin\\ru.Khaliullin\\" +
                "searchForTruth\\truth1\\Павловская_C++_ООП_ПрактикумV1.pdf");

        try {
            byte[] buf = new byte[BUFFER_SIZE];

            int b = is.read(buf);


            while (b!=-1) {

                os.write(buf,0, b);

            }
        } finally {
            is.close();
            os.close();
        }
    }

   /* public static void main(String[] args) throws IOException {

        InputStream is = new FileInputStream("Game.mkv");
        OutputStream os = new FileOutputStream("GameV2.mkv");
        try {

            byte[] buf = new byte[BUFFER_SIZE];
            int b;
            while ((b = is.read(buf)) != -1) {
                os.write(buf, 0, b);
            }

        } finally {
            is.close();
            os.close();
        }
    }*/
}
