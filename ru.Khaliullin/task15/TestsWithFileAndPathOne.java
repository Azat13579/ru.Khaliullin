package task15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestsWithFileAndPathOne {
    public static void main(String[] args) {

        String s = File.separator;
        File dir1 = new File("D:" + s + "Обучение" + s + "IdeaProjects" + s + "ru" + s + "task15_1" + s + "a");
        //File dir2 = new File("D:" + s + "Обучение" + s + "IdeaProjects" + s + "ru" + s + "task15_1" + s + "b");
        File dir3 = new File("D:" + s + "Обучение" + s + "IdeaProjects" + s + "ru" + s + "task15_1" + s + "a"
                + s + "a1");

        File dir4 = new File("D:" + s + "Обучение" + s + "IdeaProjects" + s + "ru" + s + "task15_1" + s + "a"
                + s + "a2");
        File dir5 = new File("D:" + s + "Обучение" + s + "IdeaProjects" + s + "ru" + s + "task15_1" + s + "b"
                + s + "b1");

        dir1.mkdir();
        dir3.mkdirs();
        dir4.mkdir();
        dir5.mkdirs();

        File file1 = new File("D:" + s + "Обучение" + s + "IdeaProjects" + s + "ru" + s + "task15_1" + s + "a"
                + s + "a.txt");
        File file2 = new File("D:" + s + "Обучение" + s + "IdeaProjects" + s + "ru" + s + "task15_1" + s + "b"
                + s + "b.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file1.getName());
        File file3 = new File("D:" + s + "Обучение" + s + "IdeaProjects" + s + "ru" + s + "task15_1" + s + "a"
                + s + "asdf.txt");
        file1.renameTo(file3);

        File file4 = new File("D:" + s + "Обучение" + s + "IdeaProjects" + s + "ru" + s + "task15_1" + s + "a"
                + s + "a2" + s + "qwer.txt");

        Path path1 = file2.toPath();
        Path path2 = file4.toPath();
        try {
            Files.copy(path1, path2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        file1.delete();
        file2.delete();
        file3.delete();
        file4.delete();
    }
}
