package task15;

import java.io.File;
import java.io.IOException;

public class RecursionTestFileAndPathTwo {
    public static void main(String[] args) {
        String s = File.separator;
        File dir1 = new File("D:" + s + "Обучение" + s + "IdeaProjects" + s + "ru" + s + "task15_2"
                + s + "dir" + s + "a");

        File dir2 = new File("D:" + s + "Обучение" + s + "IdeaProjects" + s + "ru" + s + "task15_2"
                + s + "dir" + s + "a" + s + "a1");

        File dir3 = new File("D:" + s + "Обучение" + s + "IdeaProjects" + s + "ru" + s + "task15_2"
                + s + "dir"  + s + "a" + s + "a2");
        File dir4 = new File("D:" + s + "Обучение" + s + "IdeaProjects" + s + "ru" + s + "task15_2"
                + s + "dir" + s + "b" + s + "b1");

        dir1.mkdir();
        dir2.mkdirs();
        dir3.mkdir();
        dir4.mkdirs();

        File file1 = new File("D:" + s + "Обучение" + s + "IdeaProjects" + s + "ru" + s + "task15_2"
                + s + "dir" + s + "a" + s + "a.txt");
        File file2 = new File("D:" + s + "Обучение" + s + "IdeaProjects" + s + "ru" + s + "task15_2"
                + s + "dir" + s + "b" + s + "b.txt");
        File file3 = new File("D:" + s + "Обучение" + s + "IdeaProjects" + s + "ru" + s + "task15_2"
                + s + "dir" + s + "d.txt");
        File file4 = new File("D:" + s + "Обучение" + s + "IdeaProjects" + s + "ru" + s + "task15_2"
                + s + "dir" + s + "e.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
            file4.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File dir = new File("D:" + s + "Обучение" + s + "IdeaProjects" + s + "ru" + s + "task15_2"
                + s + "dir");
        recursivePass(dir);



    }

    private static void recursivePass(File dir) {
        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                //file.delete();
                System.out.println("файл <" + file + ">");


            } else {
                // каталог
                recursivePass(file);

            }
        }
        //dir.delete();
        System.out.println("каталог <" + dir + ">");
    }
}
