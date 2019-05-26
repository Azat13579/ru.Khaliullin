package task17;

import java.io.*;
import java.util.regex.Pattern;

public class Use {

    private static final String libFile = "library.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Library lib = new Library();
        lib.setLibraryName("им. В.И. Ленина");

        Book book1 = new Book("Тёмная башня", "Стивин Кинг", 1982);
        lib.addBook(book1);
        Book book2 = new Book("Идиот", "Фёдор Достоевский", 1869);
        lib.addBook(book2);
        Book book3 = new Book("Война и мир", "Лев Толстой", 1869);
        lib.addBook(book3);
       Book book4 = new Book("Анна Каренина", "Лев Толстой", 1877);
        lib.addBook(book4);
        Book book5 = new Book("Властелин колец", "Джон Толкиен", 1955);
        lib.addBook(book5);
        Book book6 = new Book("Песнь Льда и Пламени", "Джордж Мартин", 1996);
        lib.addBook(book6);

        saveLibrary(lib);

        loadLibrary();

        addBooksInConsole(lib);

        loadLibrary();

    }

    /**
     * добавление книг с консоли в массив и сохрение в файле вызовом метода saveLibrary!!!
     */
    private static void addBooksInConsole(Library lib) throws IOException {
        String bookName;
        String autorName;
        int publishingYear;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0 ; i > 1 ; ){
            System.out.println("Введите название книги: ");
            String s1 = reader.readLine();
            System.out.println("Введите имя автора этой книги: ");
            String s2 = reader.readLine();
            System.out.println("Введите год издания данной книги:");
            String s3 = reader.readLine();
            Integer i3 = Integer.parseInt(s3);
            Book bookNew = new Book(s1, s2, i3);
            lib.addBook(bookNew);
            saveLibrary(lib);

            System.out.println("Остановить ввод новых книг в библиотеку??? Y\\X");
            String s4 = reader.readLine();

            if(s4.equals("[yY]|[уУ])")){
                i = i+1;
            }else{
                System.out.println("Продолжим добавление книг!");
            }
        }
    }

    /**
     * вывод в консоль списка всех книг из файла!!!
     */
    private static void loadLibrary() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(libFile)
        )) {
            System.out.println(ois.readObject());
            } catch (EOFException e) {
            System.out.println("В библтиотеке нет книг!");
        }


    }

    /**
     * сохранение книг в файле!!!
     */
    private static void saveLibrary(Library library) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(libFile)
        )) {
            oos.writeObject(library);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
